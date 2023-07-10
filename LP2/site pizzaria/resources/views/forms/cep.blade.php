@include('common.header')

@section('content')
    
@endsection

@if(isset($cliente))

<form class="text-center border border-light p-5" action="{{ route('buscar-endereco') }}" method="POST">
@csrf
<p class="h4 mb-4">Cadastro de endereço</p>

<div class="form-row mb-4">
    <input type="text" id="cep" name="cep" class="form-control" placeholder="CEP">
</div>
<button class="btn btn-info my-4 btn-block" type="submit">Consultar CEP</button>
</form>
@endif

@include('common.footer')