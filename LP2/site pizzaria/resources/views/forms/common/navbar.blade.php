
<nav class="navbar navbar-expand-lg navbar-dark danger-color">

  <a class="navbar-brand" href="home">Pizzaria do Araújo</a>

  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#basicExampleNav"
    aria-controls="basicExampleNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="basicExampleNav">

      <ul class="navbar-nav mr-auto ml-auto">
        <li class="nav-item ">
          <a class="nav-link" href="produtos">Produtos</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about">Sobre</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="loja">Promoções</a>
        </li>
      </ul>

    @auth

    <ul class="navbar-nav ml-auto nav-flex-icons">
      <li class="nav-item">
        <a class="nav-link waves-effect waves-light">
          <i class="fas fa-envelope"></i>
        </a>
      </li>

      <li class="nav-item avatar dropdown">
        <a class="nav-link dropdown-toggle waves-effect waves-light" id="navbarDropdownMenuLink-5" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
          <img src="{{asset('public/img/logo.png')}}" class="rounded-circle z-depth-0" alt="avatar image" height="35">
        </a>
        <div class="dropdown-menu dropdown-menu-right dropdown-secondary" aria-labelledby="navbarDropdownMenuLink-5">
          <a class="dropdown-item waves-effect waves-light" href="sacola">Sacola     <i class="fas fa-shopping-bag"></i></a>
          <a class="dropdown-item waves-effect waves-light" href="pedidos">Meus Pedidos</a>
          @if(Auth::user()->admin == '1')
            <a class="dropdown-item waves-effect waves-light" href="#">Adicionar produtos</a>
          @endif
          <a class="dropdown-item waves-effect waves-light" href="{{route('perfil')}}">Perfil</a>
          <a class="dropdown-item waves-effect waves-light" href="logout">Sair</a>
        </div>
      </li>
    </ul>
    
    @endauth

    @guest
    <ul class="navbar-nav ml-auto nav-flex-icons">
      <li class="nav-item">
        <a class="nav-link waves-effect waves-light" href="login">
          <i class="fas fa-user"></i> Login
        </a>
      </li>
      <li class="nav-item">
        <a class="nav-link waves-effect waves-light" href="signup">
          <i class="fas fa-user-plus"></i> Registrar
        </a>
      </li>
    @endguest
  </div>


</nav>