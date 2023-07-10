@include('common.header')

@section('content')
    
@endsection


<form class="text-center border border-light p-5" action="{{ route('cadastraEndereco') }}" method="POST">
@csrf
<p class="h4 mb-4">Cadastro de endereço</p>

<div class="form-row mb-4">
    <input type="text" id="cep" name="cep" class="form-control" placeholder="CEP" value="{{ isset($endereco['cep']) ? $endereco['cep'] : '' }}">
</div>

<div class="form-row mb-4">
<div class="col">
    <input type="text" id="Logradouro"  name="logradouro" class="form-control" placeholder="Logradouro" value="{{ isset($endereco['logradouro']) ? $endereco['logradouro'] : '' }}" required>
</div>
<div class="col">
    <input type="text" id="numero" name="numero" class="form-control" placeholder="Número" value="{{ isset($endereco['numero']) ? $endereco['numero'] : '' }}" required>
</div>

<div class="col">
    <input type="text" id="complemento" name="complemento" class="form-control" placeholder="Complemento" value="{{ isset($endereco['complemento']) ? $endereco['complemento'] : '' }}" required>
</div>
</div>

<div class="form-row mb-4">
<div class="col">
    <input type="text" id="bairro" name="bairro" class="form-control" placeholder="Bairro" value="{{ isset($endereco['bairro']) ? $endereco['bairro'] : '' }}" required>
</div>
<div class="col">
    <input type="text" id="uf" name="uf" class="form-control mb-4" placeholder="UF" value="{{ isset($endereco['uf']) ? $endereco['uf'] : '' }}" required>
</div>
<div class="col">
<input type="text" id="cidade" name="cidade" class="form-control" placeholder="Cidade" value="{{ isset($endereco['localidade']) ? $endereco['localidade'] : '' }}" required>
</div>
</div>


<button class="btn btn-info my-4 btn-block" type="submit">Cadastrar endereco</button>


</form>


@include('common.footer')
