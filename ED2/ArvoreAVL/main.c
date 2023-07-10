#include <stdio.h>
#include <stdlib.h>
#include "arvoreAVL.h"
#include <locale.h>

int main()
{
    setlocale(LC_ALL,"portuguese");

    int x;
    ArvAVL *raiz;

    //criando a arvore
    raiz = cria_arvAvl();

    x = insere_arvAvl(raiz, 100);
    x = insere_arvAvl(raiz, 140);
    x = insere_arvAvl(raiz, 160);
    x = insere_arvAvl(raiz, 130);
    x = insere_arvAvl(raiz, 150);
    x = insere_arvAvl(raiz, 110);
    x = insere_arvAvl(raiz, 120);

    if(x){
        printf("Elemento inserido com sucesso!\n ");
    }else{
        printf("Erro, não possivel inserir o elemento \n");
    }

    //consulta
    printf("\nBusca na arvore binaria: \n");
    if(consulta_arvAvl(raiz, 140)){
        printf("\nConsulta realizada com sucesso!");
    }else{
        printf("\nElemento não encontrado...");
    }

    //verifica se vazia
    if(vazia_arvAvl(raiz)){
        printf("A arvore vazia");
    }
    else{
        printf("A arvore possui elementos");
    }
    printf("\n");

    //altura arvore
    x = altura_arvAvl(raiz);
    printf("\nAltura da arvore %d\n",x);

    //numero de nos
    x = totalNO_arvAvl(raiz);
    printf("\nTotal de n os na arvore: %d\n",x);

    //pre ordem
    printf("\nPré Ordem\n");
    preOrdem_arvAvl(raiz);

    //em ordem
    printf("\nEm Ordem\n");
    emOrdem_arvAvl(raiz);

    //pos ordem
    printf("\n Pós Ordem\n");
    posOrdem_arvAvl(raiz);

    //x = remove_arvAvl(raiz, 140);
    if(x){
        printf("Elemento removido com sucesso!.");;
    }
    else{
        printf("Erro, não foi possivel remover o elemento");
    }

    //destruir arvore
    liberar_arvAvl(raiz);
    return 0;
}


