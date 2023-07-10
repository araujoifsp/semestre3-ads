#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include "arvoreLLRB.h"

int main()
{
    setlocale(LC_ALL,"portuguese");

    int x;
    arvoreLLRB *raiz;

    raiz = cria_arv();
    x = insere_arvoreLLRB(raiz, 150);
    x = insere_arvoreLLRB(raiz, 110);
    x = insere_arvoreLLRB(raiz, 100);
    x = insere_arvoreLLRB(raiz, 130);
    x = insere_arvoreLLRB(raiz, 120);
    x = insere_arvoreLLRB(raiz, 140);
    x = insere_arvoreLLRB(raiz, 160);

    remove_arvoreLLRB(raiz, 100);

    return 0;
}
