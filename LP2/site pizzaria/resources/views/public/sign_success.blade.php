@extends('common.base-template')

@section('content')

<div class="container">
    <div class="row mx-auto">
        <div class="card">

        <!-- Card image -->
        <div class="view overlay">
        <img class="card-img-top" src="https://mdbootstrap.com/img/Mockups/Lightbox/Thumbnail/img%20(67).webp"
            alt="Card image cap">
        <a href="#!">
            <div class="mask rgba-white-slight"></div>
        </a>
        </div>

        <!-- Card content -->
        <div class="card-body">

        <!-- Title -->
        <h4 class="card-title">{{$info['nome'].' '.$info['sobrenome']}}</h4>
        <!-- Text -->
        <p class="card-text">{{$info['email'].' '.$info['fone']}}</p>
        <!-- Button -->
        <a href="#" class="btn btn-primary">Button</a>

        </div>

        </div>
        <!-- Card -->
    </div>
</div>
<!-- Card -->