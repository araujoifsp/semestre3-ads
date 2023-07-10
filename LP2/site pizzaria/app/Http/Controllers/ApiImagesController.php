<?php

namespace App\Http\Controllers;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use GuzzleHttp\Client;

class ApiImagesController extends Controller
{
    public function getPizzaImages($count = 3)
    {
        $client = new Client();

        // Faça a requisição para a API da Unsplash
        $response = $client->get('https://api.unsplash.com/search/photos', [
            'query' => [
                'query' => 'pizza',
                'per_page' => $count,
                'client_id' => 'gOPhxZW5E-mAjVO7oaDQRmDdgkPIUvO3pm2WAGTYj6E',
            ],
        ]);

        $data = json_decode($response->getBody(), true);

        // Extraia os links das imagens
        $imageLinks = [];
        foreach ($data['results'] as $result) {
            $imageLinks[] = $result['urls']['regular'];
        }

        return $imageLinks;
    }

    public function showPizzaImages()
    {
        $imageLinks = $this->getPizzaImages();
        return response()->view('public.about', ['imageLinks' => $imageLinks]);
    }
}
