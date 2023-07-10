@include('common.header');


<div class="container">
    <div class="row">
        <div class="col-md-6 mx-auto">
            <div class="text-center">
                <img src="{{ asset('public/img/logo.png') }}" alt="thumbnail" class="img-thumbnail mx-auto d-block" style="width: 200px">
            </div>

            <form method="POST" class="text-center border border-light p-5 mt-5" action="cadastrar-cliente">
                @csrf   
                <p class="h4 mb-4">Cadastre-Se</p>

                <div class="container">
                    <div class="row">
                        <div class="col-sm">
                            <div class="form-row mb-4">
                                <div class="col">
                                    <input type="text" id="defaultRegisterFormFirstName" class="form-control" placeholder="Name" name="nome" required>
                                </div>
                                <div class="col">
                                   <input type="text" id="defaultRegisterFormLastName" class="form-control" placeholder="Sobrenome" name="snome" required>
                                </div>
                             </div>

                            <input type="email" id="defaultRegisterFormEmail" class="form-control mb-4" placeholder="E-mail" name="email" required>
                            <input type="password" id="defaultRegisterFormPassword" class="form-control" placeholder="Senha" aria-describedby="defaultRegisterFormPasswordHelpBlock" name="senha" required>
                             <small id="defaultRegisterFormPasswordHelpBlock" class="form-text text-muted mb-4"></small>

                            <input type="text" name="telefone" id="defaultRegisterPhonePassword" class="form-control" placeholder="Telefone" aria-describedby="defaultRegisterFormPhoneHelpBlock" name="fone" required>

                            <a href="login"><small id="defaultRegisterFormPhoneHelpBlock" class="form-text text-muted mb-4">Já tenho cadastro</small></a>
                            </div>
                    </div>
                </div>
                    <input type="submit" value="entrar" name='enviar' class="btn btn-primary btn-block">
                </form>
        </div>
    </div>
</div>