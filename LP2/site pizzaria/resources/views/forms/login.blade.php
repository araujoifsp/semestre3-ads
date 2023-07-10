@include('common.header')

<div class="col-5 mx-auto my-5">
    <div class="text-center">
        <div class="mb-4">
            <img src="{{asset('public/img/logo.png')}}" alt="thumbnail" class="img-thumbnail mx-auto d-block" style="width: 200px">
        </div>
    </div>


    <form method="POST" class="text-center border border-light p-5" action="entrar">
        @csrf 
        <h1>Fazer login</h1>
        
        <div class="container">
            <div class="row">
                <div class="col-sm">
                    <div class="form-outline mb-4">
                        <input type="email" id="form2Example1" class="form-control" name="email">
                        <label class="form-label" for="form2Example1">E-mail</label>
                    </div>
                    <div class="form-outline mb-4">
                        <input type="password" id="form2Example2" class="form-control" name="senha">
                        <label class="form-label" for="form2Example2">Senha</label>
                    </div>
                    <a href="signup"><small id="defaultRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">Não tenho cadastro</small></a>
                </div>
            </div>
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Entrar" name="entrar">
    </form> 
</div>
