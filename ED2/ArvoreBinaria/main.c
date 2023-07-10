#include <stdio.h>
#include <stdlib.h>
#include "arvoreBinaria.h"

int main()
{
    int x;
    ArvBin *raiz;

    //criando a arvore
    raiz = cria_arvBin();

    //inserção
    x = insere_arvBin(raiz, 150);
    x = insere_arvBin(raiz, 110);
    x = insere_arvBin(raiz, 100);
    x = insere_arvBin(raiz, 130);
    x = insere_arvBin(raiz, 120);
    x = insere_arvBin(raiz, 140);
    x = insere_arvBin(raiz, 160);

    //consulta
    printf("\nBusca na arvore binaria: \n");
    if(consulta_arvBin(raiz, 140)){
        printf("\nConsulta realizada com sucesso!");
    }else{
        printf("\nElemento não encontrado...");
    }

    //verifica se vazia
    if(vazia_arvBin(raiz)){
        printf("A arvore vazia");
    }
    else{
        printf("A arvore possui elementos");
    }
    printf("\n");

    //remocao
    //x = remove_arvBin(raiz, 100);

    //altura arvore
    x = altura_arvBin(raiz);
    printf("Altura da arvore %d",x);

    //numero de nos
    x = totalNO_arvBin(raiz);
    printf("Total de n os na arvore: %d",x);

    //pre ordem
    preOrdem_arvBin(raiz);

    //em ordem
    emOrdem_arvBin(raiz);

    //pos ordem
    posOrdem_arvBin(raiz);



    //destruir arvore
    liberar_arvBin(raiz);
    return 0;
}



