<?php

namespace App\Http\Middleware;

use Closure;
use Illuminate\Http\Request;
use Symfony\Component\HttpFoundation\Response;

class AdminAccess
{
    /**
     * Handle an incoming request.
     *
     * @param  \Closure(\Illuminate\Http\Request): (\Symfony\Component\HttpFoundation\Response)  $next
     */
    public function handle(Request $request, Closure $next): Response
    {
        if(Auth::check() && Auth::user()->cliente == 1){
            return $next($request);
        }
        else{
            if(Auth::check()){
                return redirect()->route('/login');
            }
            dd('Você não tem permissão para acessar essa página');
        }
    }
}
