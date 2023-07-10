<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;
use Illuminate\Support\Facades\DB;

class EnderecoController extends Controller
{
    public function buscarEndereco(Request $request)
    {
        $cep = $request->input('cep');

        $link = "https://viacep.com.br/ws/{$cep}/json/";

        $response = Http::get($link);

        if ($response->successful()) {

            $endereco = $response->json();
            
                return view('forms.endereco')->with('endereco', $endereco);
        }
    
        return redirect()->back()->with('error', 'Falha ao buscar o endereço. Por favor, verifique o CEP e tente novamente.');
    }

    public function cadastraEndereco(Request $request)
    {
        $endereco = [
            'cep' => $request->cep,
            'logradouro' => $request->logradouro,
            'numero' => $request->numero,
            'complemento' => $request->complemento,
            'bairro' => $request->bairro,
            'cidade' => $request->cidade,
            'uf' => $request->uf,
            'user_id' => '1',
        ];

        $res = DB::table('enderecos')->insert($endereco);

        if ($res) {
            echo '<script>alert("Endereço cadastrado com sucesso!")</script>';
            return view('forms.login');
        }
    }
}
