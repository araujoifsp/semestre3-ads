<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     */
    public function up(): void
    {
        
        Schema::create('enderecos', function (Blueprint $table) {
            $table->id();
            $table->string('cep', 8);
            $table->string('logradouro', 255);
            $table->string('numero', 10);
            $table->string('complemento', 255)->nullable();
            $table->string('bairro', 255);
            $table->string('cidade', 255);
            $table->string('uf', 2);
            $table->unsignedBigInteger('user_id');
            $table->foreign('user_id')->references('id')->on('users');
            $table->timestamps();
        });
        
    }

    /**
     * Reverse the migrations.
     */
    public function down(): void
    {
        //
    }
};
