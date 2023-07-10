@extends('common.base-template')

@section('content')
 
<div class="container">

<div class="row my-5 mx-auto">
        <h1>Promoções</h1>
</div>
<!--Carousel Wrapper-->
<div id="carousel-example-1z" class="carousel slide carousel-fade" data-ride="carousel">
  <!--Indicators-->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-1z" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-1z" data-slide-to="1"></li>
    <li data-target="#carousel-example-1z" data-slide-to="2"></li>
  </ol>

  <div class="carousel-inner" role="listbox">
  
    <div class="carousel-item active">
      <img class="d-block w-100" src="{{asset('public/img/promo/combo.png')}}" alt="First slide">
    </div>

    <div class="carousel-item">
      <img class="d-block w-100" src="{{asset('public/img/promo/promocao.png')}}" alt="Second slide">
    </div>

    <div class="carousel-item">
      <img class="d-block w-100" src="{{asset('public/img/background_home.jpg')}}" alt="Third slide">
    </div>

  </div>

  <a class="carousel-control-prev" href="#carousel-example-1z" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carousel-example-1z" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>

</div>

</div>
</div>

@endsection