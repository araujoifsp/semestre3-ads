@extends('common.base-template')
<?php
$apiImagesController = new App\Http\Controllers\ApiImagesController();

$pizzaImages = $apiImagesController->getPizzaImages();
?>
@section('content')
<div class="container-fluid">
    <div class="row">
        <div class="col-12">
            <img src="<?php echo $pizzaImages[0] ?>" alt="Banner Image" class="img-fluid w-100 img-thumbnail">
        </div>
    </div>
</div>
<div class="container">

    <div class="row my-5 mx-auto">
        <h1>Pizzas</h1>
    </div>


    <div class="row my-5 mx-auto">
        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <input type="hidden" name="id_produto" value="1">
                        <input type="hidden" name="valor" value="40.00">
                        <input type="hidden" name="nome" value="Pizza 4 Queijos">
                        <h4 class="card-title">Pizza 4 Queijos</h4>
                        <p class="card-text">R$: 40,00</p>
                        <img class="card-img-top" src="{{asset('public/img/pizzas/4queijos.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>

        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="2">
            <input type="hidden" name="valor" value="40.00">
            <input type="hidden" name="nome" value="Pizza Calabresa">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Pizza Calabresa</a></h4>
                        <p class="card-text">RS: 40,00</p>
                        <img class="card-img-top" src="{{asset('public/img/pizzas/calabresa.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>

        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="3">
            <input type="hidden" name="valor" value="40.00">
            <input type="hidden" name="nome" value="Pizza Portuguesa">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Pizza Portuguesa</a></h4>
                        <p class="card-text">RS: 40,00</p>
                        <img class="card-img-top" src="{{asset('public/img/pizzas/portuguesa.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>

<div class="container">

    <div class="row my-5 mx-auto">
        <h1>Doces</h1>
    </div>


    <div class="row my-5 mx-auto">

        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="4">
            <input type="hidden" name="valor" value="20.00">
            <input type="hidden" name="nome" value="Brotinho de Brigadeiro">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Brotinho de Brigadeiro</a></h4>
                        <p class="card-text">RS: 20,00</p>
                        <img class="card-img-top" src="{{asset('public/img/pizzas/brigadeiro.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>


        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="5">
            <input type="hidden" name="valor" value="20.00">
            <input type="hidden" name="nome" value="Brotinho de Ovomaltine">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Brotinho de Ovomaltine</a></h4>
                        <p class="card-text">RS: 20,00</p>
                        <img class="card-img-top" src="{{asset('public/img/pizzas/ovomaltine.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>

        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="6">
            <input type="hidden" name="valor" value="20.00">
            <input type="hidden" name="nome" value="Churrosbread">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Churrosbread</a></h4>
                        <p class="card-text">RS: 20,00</p>
                        <img class="card-img-top" src="{{asset('public/img/pizzas/churrosbread.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>


<div class="container">

    <div class="row my-5 mx-auto">
        <h1>Bebidas</h1>
    </div>

    <div class="row my-5 mx-auto">
        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="7">
            <input type="hidden" name="valor" value="10.00">
            <input type="hidden" name="nome" value="Coca-Cola">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Coca-Cola</a></h4>
                        <p class="card-text">RS: 10,00</p>
                        <img class="card-img-top" src="{{asset('public/img/bebidas/coca.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>

        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="8">
            <input type="hidden" name="valor" value="8.00">
            <input type="hidden" name="nome" value="Sprite">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Sprite</a></h4>
                        <p class="card-text">RS: 8,00</p>
                        <img class="card-img-top" src="{{asset('public/img/bebidas/sprite.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola" >
                    </div>
                </div>
            </div>
        </form>

        <form action="{{route('addCarrinho')}}" method="POST">
        @csrf
            <input type="hidden" name="id_produto" value="9">
            <input type="hidden" name="valor" value="8.00">
            <input type="hidden" name="nome" value="Fanta Guarana">
            <div class="col">
                <div class="card" style="width: 300px;">
                    <div class="card-body">
                        <h4 class="card-title"><a>Fanta Guarana</a></h4>
                        <p class="card-text">RS: 8,00</p>
                        <img class="card-img-top" src="{{asset('public/img/bebidas/fanta.jpg')}}" alt="Card image cap">
                        <input type="submit" class="btn btn-primary" value="Adicionar a Sacola">
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
@endsection