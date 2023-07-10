@extends('common.base-template')

@section('content')
    <div class="container">
        <div class="row">
            <div class="col-md-8 mx-auto">
                <h1>Sacola de Compras</h1>

                @if ($produtos->isEmpty())
                    <p>Você ainda não possui produtos na sacola!</p>
                    <a href="{{ route('public.produtos') }}">Voltar para a página de produtos</a>
                @else
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Produto</th>
                                <th>Preço</th>
                                <th>Ações</th>
                            </tr>
                        </thead>
                        <tbody>
                            @php
                                $total = 0;
                            @endphp
                            @foreach ($produtos as $produto)
                                <tr>
                                    <td>{{ $produto->nome_produto }}</td>
                                    <td>R$ {{ $produto->valor }}</td>
                                    <td>
                                        <form action="{{route('removeItem')}}" method="POST">
                                            @csrf
                                            <input type="hidden" name="id_produto" value="{{ $produto->id_produtos }}">
                                            <button type="submit" class="btn btn-danger btn-sm">Remover</button>
                                        </form>
                                    </td>
                                </tr>
                                @php
                                    $total += $produto->valor;
                                @endphp
                            @endforeach
                        </tbody>
                    </table>
                    
                    <div class="text-right">
                        <p>Total: R$ {{ $total }}</p>
                        <form method="POST" action="{{route('fecharPedido')}}">
                            @csrf
                            <input type="hidden" name="pedido_id" value="{{$produto->id_pedido}}">
                            <input type='hidden' name='total' value='{{$total}}'>
                            <button type="submit" class="btn btn-primary">Finalizar Compra</button>
                        </form>
                    </div>
                @endif
            </div>
        </div>
    </div>
@endsection
