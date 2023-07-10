@extends('common.base-template')

@section('content')
    
<div class="container">

<div class="row my-5 mx-auto">
        <h1>Quem somos?</h1>
</div>

<div class="row">
                <div class="col-sm">
                    <img src="{{asset('public/img/logo.png')}}" alt="thumbnail" class="img-thumbnail" style="width: 500px">
                </div>

                    <div class="col-sm text-justify">
                      Bem-vindo à Pizzaria do Araújo!
                      <p>
                        Aqui, na Pizzaria do Araújo, temos o prazer de lhe oferecer uma experiência gastronômica única e deliciosa. Somos uma pizzaria fictícia, mas a paixão pela pizza é real!
                      </p>

                      <p>
                      Nossa equipe de talentosos pizzaiolos é dedicada a criar pizzas que são verdadeiras obras de arte. Temos uma variedade de opções no nosso menu, desde as clássicas Margherita e Pepperoni até as mais ousadas combinações de sabores. Cada pizza é cuidadosamente montada e assada em nosso forno a lenha, garantindo que você receba uma pizza perfeitamente cozida, com o equilíbrio perfeito entre crocância e maciez.
                      </p>

                      <p>
                      Na Pizzaria do Araújo, acreditamos que a qualidade é essencial. Por isso, utilizamos apenas os melhores ingredientes, desde os molhos até os queijos e os complementos. Nossa equipe está sempre em busca de novas ideias e sabores para surpreender e encantar nossos clientes.
                      </p>

                      <p>
                      Além de nossas pizzas incríveis, também oferecemos uma variedade de acompanhamentos e sobremesas irresistíveis. Seja para um jantar em família, uma saída com os amigos ou um encontro romântico, a Pizzaria do Araújo é o lugar perfeito para desfrutar de uma refeição deliciosa e descontraída.
                      </p>

                      <p>
                        Nossa missão é proporcionar a você uma experiência gastronômica memorável, repleta de sabor, qualidade e atendimento excepcional. Venha nos visitar e descubra por que a Pizzaria do Araújo é a escolha ideal para os amantes de pizza exigentes.
                      </p>

                        Agradecemos por nos escolher e esperamos vê-lo em breve!

                        Equipe da Pizzaria do Araújo
                    </div>
                </div>

              <div class="row my-5 mx-auto">
                  <h1>Nossos produtos</h1>
              </div>

            <div class="row my-5 mx-auto">
                @if(isset($imageLinks))
                  @foreach($imageLinks as $link)
                    <img src="{{ $link }}" alt="Pizza Image">
                  @endforeach
                @endif
            </div>

<div class="row my-5 mx-auto">
    <h1>Localização</h1>
</div>
 <!--Google map-->
<div id="map-container-google-2" class="z-depth-1-half map-container" style="height: 500px">
    <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d7321.122069232783!2d-46.5382602!3d-23.4402191!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94cef51fbe5f8681%3A0x1f8cf929993dc97!2sInstituto%20Federal%20de%20Educa%C3%A7%C3%A3o%2C%20Ci%C3%AAncia%20e%20Tecnologia%20de%20S%C3%A3o%20Paulo%20IFSP%20Guarulhos!5e0!3m2!1spt-BR!2sbr!4v1680473860159!5m2!1spt-BR!2sbr" width="600" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
</div>

<div class="row my-5 mx-auto">
    <h1>Contato</h1>
</div>
<div style="font-size: 2rem;">
  <div><i class="fas fa-phone"></i> (11)0000-0000</div>
  <div><i class="fas fa-at"></i> contato@pizzaria.com.br</div>
  <div><i class="fab fa-instagram fa-fw pink-text"></i> instagram</div>
  <div><i class="fab fa-facebook-f fa-fw blue-text"></i> facebook</div>
  <div><i class="fab fa-twitter fa-fw blue-text"></i> twitter</div>
  
</div>
</div>

</div>
</div>


@endsection

