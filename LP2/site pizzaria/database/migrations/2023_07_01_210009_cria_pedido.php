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

        Schema::create('pedidos', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('id_cliente');
            //coluna para o status do pedido, char de 2 caracteres
            $table->char('status', 2);
            //status pode ser: AB(aberto), FE(fechado), CA(cancelado)
            $table->timestamps();
        });

        Schema::create('pedidos_produtos', function (Blueprint $table) {
            $table->id();
            $table->string('nome_produto', 100);
            $table->decimal('valor', 10, 2);
            $table->timestamps();
            $table->unsignedBigInteger('id_pedido');
            $table->unsignedBigInteger('id_produtos');
            $table->foreign('id_pedido')->references('id')->on('pedidos');
            $table->foreign('id_produtos')->references('id')->on('produtos');
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
