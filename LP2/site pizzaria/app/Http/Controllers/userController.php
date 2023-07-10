<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Auth;

//controller para as funções relacionadas ao login 
class userController extends Controller
{
    public function logout()
    {
        Auth::logout();
        return view('public.produtos');
    }

    public function perfil()
    {
        $user = Auth::user();
        return view('forms.perfil' ,compact('user'));
    }

    public function atualizar(Request $request)
    {

        $user = Auth::user();

        $request->validate([
            'nome' => 'required|string|max:255',
            'snome' => 'required|string|max:255',
            'email' => 'required|email|unique:users,email,'.$user->id,
            'telefone' => 'nullable|string|max:20',
        ]);

        $user->name = $request->nome;
        $user->snome = $request->snome;
        $user->email = $request->email;
        $user->telefone = $request->telefone;
        $user->save();

        return view('forms.perfil' ,compact('user'));
    }

    public function entrar(Request $request)
    {
        if(Auth::attempt(['email' => $request->email, 'password' => $request->senha])){
            echo '<script>alert("Login efetuado com sucesso")</script>';
            return view('public.produtos');
        }else{
            echo '<script>alert("Email ou senha incorretos")</script>';
            return view('forms.login');
        }
    }

    public function cadastrarCliente(Request $request)
    {
        $users = DB::table('users')->where('email', $request->email)->value('email');
        if ($users == $request->email) {
            echo '<script>alert("Email já cadastrado")</script>';
            return view('forms.signup');
        } else {
            // Criptografar a senha
            $senhaCriptografada = password_hash($request->senha, PASSWORD_DEFAULT);
            

            $cliente = [
                'name' => $request->nome,
                'snome' => $request->snome, 
                'telefone' => $request->telefone,
                'email' => $request->email,
                'password' => $senhaCriptografada,
                'admin' => 0,//*
                'cliente' => 1,
                'email_verified_at' => now(),
            ];
            /*
                * todos os usuario cadastrados por formulario serão clientes comuns
                * apenas o moderador do sistema pode cadastrar um usuario como admin
                * dessa forma, usuarios admin serão cadastrados diretamente no banco
            */ 
            
            $res = DB::table('users')->insert($cliente);
            if ($res) {
                return view('forms.cep',compact('cliente'));
            } else {
                echo 'script>alert("Erro ao cadastrar")</script>';
                return view('forms.signup');
            }
        }
    }

}
