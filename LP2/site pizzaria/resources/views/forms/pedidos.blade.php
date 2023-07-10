@extends('common.base-template')

@section('content')
    <h1 class="h1-responsive">Meus Pedidos</h1>

    @if ($pedidos->isEmpty())
        <p>Você ainda não possui pedidos!</p>
        <a href="{{ route('public.produtos') }}" class="btn btn-primary">Voltar para a página de produtos</a>
    @else
        <ul class="list-unstyled">
            @foreach ($pedidos as $pedido)
                <form action="{{ route('cancelarPedido') }}" method="POST">
                @csrf
                <input type="hidden" name="id_pedido" value="{{ $pedido->id }}">
                <li class="mb-4">
                    <h2 class="h2-responsive">Pedido #{{ $pedido->id }}</h2>
                    <p>Status: @if($pedido->status === 'AB') Aberto @elseif($pedido->status === 'FE') Fechado @elseif($pedido->status === 'CA') Cancelado @endif</p>

                    <ul class="list-unstyled">
                        @foreach ($produtos as $produto)
                            @if ($produto->id_pedido === $pedido->id)
                                <li>{{ $produto->id_produtos }} - {{$produto->nome_produto}} - R$ {{ $produto->valor }}</li>
                            @endif
                        @endforeach
                    </ul>

                    @if ($pedido->status === 'FE')
                        <button type="submit" class="btn btn-danger">Cancelar Compra</button>
                    @endif
                </li>
                </form>
            @endforeach
        </ul>
    @endif
@endsection