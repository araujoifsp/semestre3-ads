<table class="table">

<thead>
        <tr>
            @foreach($cols as $col)
                <th scope="col">{{$col}}</th>
            @endforeach
        </tr>
</thead>

<tbody>
@foreach($data as $i)    
    <tr>
       <!--  --> <!-- <th scope="row">→</th>
        <td>{{$i['Nome']}}</td>
        <td>{{$i['snome']}}</td>
        <td>{{$i['idade']}}</td>
        <td>{{$i['Insta']}}</td> -->
        @foreach($i as $nome => $valor)
            <td>{{$valor}}</td>
        @endforeach()
    </tr>
@endforeach()
</tbody>
</table>