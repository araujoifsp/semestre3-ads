<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PublicController;
use App\Http\Controllers\ClienteController;
use App\Http\Controllers\EnderecoController;
use App\Http\Controllers\userController;
use App\Http\Controllers\PedidoController;
use App\Http\Controllers\SacolaController;
use App\Http\Controllers\ApiImagesController;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/

//rotas para navegação entre as paginas
Route::get('/',[PublicController::class,'produtos']);
Route::get('/home',[PublicController::class,'produtos']);
Route::get('/signup',[PublicController::class,'signup']);
Route::get('/login',[PublicController::class,'login'])->name('login');
Route::get('/about',[PublicController::class,'about']);
Route::get('/loja',[PublicController::class,'loja']);
Route::get('/produtos',[PublicController::class,'produtos']);

//rotas para cadastro, login e logout
Route::post('/entrar',[userController::class,'entrar']);
Route::post('/cadastrar-cliente',[userController::class,'cadastrarCliente']);
Route::get('/logout',[userController::class,'logout'])->name('logout');

//rota para abrir o perfil do cliente
Route::get('/perfil',[userController::class,'perfil'])->name('perfil');
Route::post('/editarPerfil',[userController::class,'atualizar'])->name('editarPerfil');

//abre a função de buscar endereco por cep
Route::post('/buscar-endereco', [EnderecoController::class, 'buscarEndereco'])->name('buscar-endereco');
Route::post('/cadastraEndereco', [EnderecoController::class, 'cadastraEndereco'])->name('cadastraEndereco');

//rotas para abrir as paginas de pedidos e carrinho
Route::get('/pedidos',[PedidoController::class,'buscaPedidos'])->name('pedidos');
Route::post('/addCarrinho',[PedidoController::class,'addCarrinho'])->name('addCarrinho');
Route::get('/sacola',[SacolaController::class,'buscaSacola'])->name('sacola');
Route::post('/removeItem',[SacolaController::class,'removeItem'])->name('removeItem');
Route::post('/fecharPedido',[PedidoController::class,'fecharPedido'])->name('fecharPedido');
Route::post('/cancelarPedido',[PedidoController::class,'cancelarPedido'])->name('cancelarPedido');

//rota para api de imagens
Route::get('/pizza-images', [ApiImagesController::class, 'showPizzaImages'])->name('pizza-images');
Route::get('/ApiImages', [ApiImagesController::class, 'getPizzaImages(1)'])->name('ApiImages');


//Proteção das paginas utilizando o jetstream
Route::middleware([
    'auth:sanctum',
    config('jetstream.auth_session'),
    'verified'
])->group(function () {
    Route::post('/addCarrinho',[PedidoController::class,'addCarrinho'])->name('addCarrinho');
});

Route::middleware([
    'auth:sanctum',
    config('jetstream.auth_session'),
    'verified'
])->group(function () {
    Route::post('/removeItem',[SacolaController::class,'removeItem'])->name('removeItem');
});

Route::middleware([
    'auth:sanctum',
    config('jetstream.auth_session'),
    'verified'
])->group(function () {
    Route::post('/fecharPedido',[PedidoController::class,'fecharPedido'])->name('fecharPedido');
});


Route::middleware([
    'auth:sanctum',
    config('jetstream.auth_session'),
    'verified'
])->group(function () {
    Route::post('/cancelarPedido',[PedidoController::class,'cancelarPedido'])->name('cancelarPedido');
});

Route::middleware([
    'auth:sanctum',
    config('jetstream.auth_session'),
    'verified'
])->group(function () {
    Route::get('/pedidos',[PedidoController::class,'buscaPedidos'])->name('pedidos');
});