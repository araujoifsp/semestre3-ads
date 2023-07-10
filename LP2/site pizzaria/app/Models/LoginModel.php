<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

// Models podem ser usados de duas maneiras:
// 1. Como coordenadores de ações diversas; Neste caso usaremos o prefixo "Model"
// 2. Como objetos de acesso ao BD; Neste caso não usaremos esse prefixo

class LoginModel extends Model {
    function signUserIn($data){
        unset($data['_token']);
        return $data;
    }
}
