<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\LoginModel;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Auth;
use App\Http\Controllers\ApiImagesController;

class PublicController extends Controller
{
    public function home()
    {
        return view('home');
    }
    
    public function loja(){
        //Pagina principal com promoções
        return view('public.loja');
    }

    public function about(){
        //chamar a função que pega as imagens da api
        $api = new ApiImagesController();
        $imageLinks = $api->getPizzaImages();
        return view('public.about', ['imageLinks' => $imageLinks]);
        
    }
    public function produtos(){
        //Lista de todos os produtos
        return view('public.produtos');
    }

    public function signup(){
        //tela de cadastro
        return view('forms.signup');
    }

    public function login(){
        //tela de login
        return view('forms.login'); 
    }

    public function save(Request $request){
        $model = new LoginModel();
        $data = $request->input();
        $v = $model -> signUserIn($data);
       // print_r($v);
        return view('public.sign_success',['info' => $v]);
        /*foreach($data as $key => $value){
            echo "$key => $value <br>";
        }
        */  
        
    }
}
