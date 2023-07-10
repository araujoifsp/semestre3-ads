@extends('common.base-template')

@section('content')

<div class="col-5 mx-auto my-5">
        <form method="POST" class="text-center border border-light p-5" action="{{route('editarPerfil')}}">
        <h1 class="">Editar Perfil</h1>
        @csrf   
            <div class="form-group">
                <label for="exampleInputEmail1">Nome</label>
                <input type="text" name="nome" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Nome" value="{{$user['name']}}">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Sobrenome</label>
                <input type="text" name="snome" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Nome" value="{{$user['snome']}}">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">E-mail</label>
                <input type="email" name="email" class="form-control" id="exampleInputPassword1" placeholder="E-mail" value="{{$user['email']}}">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Telefone</label>
                <input type="text" name="telefone" class="form-control" id="exampleInputPassword1" placeholder="Telefone" value="{{$user['telefone']}}">
            </div>
            <button type="submit" class="btn btn-primary">Alterar</button>
        </form>
</div>

@endsection