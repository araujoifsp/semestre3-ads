<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class PedidoController extends Controller
{
    
    public function buscaPedidos(){
        $user = auth()->user();
        $res = DB::table('pedidos')->where('id_cliente', $user->id)->get();
        if($res->isEmpty()){
            echo '<script>alert("Você ainda não possui pedidos!")</script>';
            return view('public.produtos');
        }else{
            $pedidos = DB::table('pedidos')->where('id_cliente', $user->id)->get();
            $produtos = DB::table('pedidos_produtos')->where('id_pedido', $pedidos[0]->id)->get();
            return view('forms.pedidos', compact('pedidos'), compact('produtos'));
        }
    }


    public function addCarrinho(Request $request){
        $user = auth()->user();
        $res = DB::table('pedidos')->where('id_cliente', $user->id)->where('status', 'AB')->get();
        if($res->isEmpty()){
            $pedido = [
                'id_cliente' => $user->id,
                'status' => 'AB',
            ];
            $res = DB::table('pedidos')->insert($pedido);
            if($res){
                $res = DB::table('pedidos')->where('id_cliente', $user->id)->where('status', 'AB')->get();
                $id_pedido = $res[0]->id;
                $item = [
                    'id_pedido' => $id_pedido,
                    'id_produtos' => $request->id_produto,
                    'nome_produto' => $request->nome,
                    'valor' => $request->valor,
                ];
                $res = DB::table('pedidos_produtos')->insert($item);
                if($res){
                    echo '<script>alert("Produto adicionado ao carrinho com sucesso!")</script>';
                    return view('public.produtos');
                }else{
                    echo '<script>alert("Falha ao adicionar o produto ao carrinho!")</script>';
                    return view('public.produtos');
                }
            }else{
                echo '<script>alert("Falha ao adicionar o produto ao carrinho!")</script>';
                return view('public.produtos');
            }
        }
        else{
            $id_pedido = $res[0]->id;
            $item = [
                'id_pedido' => $id_pedido,
                'id_produtos' => $request->id_produto,
                'nome_produto' => $request->nome,
                'valor' => $request->valor,
            ];
            $res = DB::table('pedidos_produtos')->insert($item);
            if($res){
                echo '<script>alert("Produto adicionado ao carrinho com sucesso!")</script>';
                return view('public.produtos');
            }else{
                echo '<script>alert("Falha ao adicionar o produto ao carrinho!")</script>';
                return view('public.produtos');
            }
        }
    }

    //funcao para fechar o pedido
    public function fecharPedido(Request $request){
            // Recupere o ID do pedido a partir do formulário ou de onde estiver disponível
            $pedidoId = $request->input('pedido_id');

            $res = DB::table('pedidos')->where('id', $pedidoId)->update(['status' => 'FE']);
            if($res){
                echo '<script>alert("Pedido fechado com sucesso!")</script>';
                return view('public.produtos');
            }else{
                echo '<script>alert("Falha ao fechar o pedido!")</script>';
                return view('public.produtos');
            }

            // Redirecione para a página de pedidos ou para qualquer outra página desejada
            return redirect()->route('public.pedidos');
    }

    //funcao para cancelar o pedido
    public function cancelarPedido(Request $request){
        // Recupere o ID do pedido a partir do formulário ou de onde estiver disponível
        $pedidoId = $request->input('id_pedido');

        $res = DB::table('pedidos')->where('id', $pedidoId)->update(['status' => 'CA']);
        if($res){
            echo '<script>alert("Pedido cancelado com sucesso!")</script>';
            return view('public.produtos');
        }else{
            echo '<script>alert("Falha ao cancelar o pedido!")</script>';
            return view('public.produtos');
        }

        // Redirecione para a página de pedidos ou para qualquer outra página desejada
        return redirect()->route('public.pedidos');
    }
}