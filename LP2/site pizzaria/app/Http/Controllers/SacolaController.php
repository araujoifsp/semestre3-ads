<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class SacolaController extends Controller
{
    public function buscaSacola(){
        $user = auth()->user();
        $res = DB::table('pedidos')->where('id_cliente', $user->id)->where('status', 'AB')->get();
        if($res->isEmpty()){
            echo '<script>alert("Você ainda não possui produtos na sacola!")</script>';
            return view('public.produtos');
        }else{
            $pedidos = DB::table('pedidos')->where('id_cliente', $user->id)->where('status', 'AB')->get();
            $produtos = DB::table('pedidos_produtos')->where('id_pedido', $pedidos[0]->id)->get();
            return view('forms.sacola', compact('produtos'));
        }
    }

    //funcao para remover item de sacola
    public function removeItem(Request $request){
        $user = auth()->user();
        $res = DB::table('pedidos')->where('id_cliente', $user->id)->where('status', 'AB')->get();
        if($res->isEmpty()){
            echo '<script>alert("Você ainda não possui produtos na sacola!")</script>';
            return view('public.produtos');
        }else{
            $id_pedido = $res[0]->id;
            $res = DB::table('pedidos_produtos')->where('id_pedido', $id_pedido)->where('id_produtos', $request->id_produto)->delete();
            if($res){
                echo '<script>alert("Produto removido da sacola com sucesso!")</script>';
                return view('public.produtos');
            }else{
                echo '<script>alert("Falha ao remover o produto da sacola!")</script>';
                return view('public.produtos');
            }
        }
    }
}
