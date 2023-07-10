#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"portuguese");

    int elem, x;
    int vordenado[] = {1,2,3,6,7};
    int vdesordenado[] = {3,4,5,2,4};

    printf("Digite o elemenento que deseja buscar: ");
    scanf("%d",&elem);
    printf("\n\nBUSCA LINEAR\n");
    x = buscaLinear(vdesordenado,5,elem);
    if(x == -1){
        printf("valor não encontrado");
    }
    else{
        printf("Valor encontrado no indice %d",x);
    }

    printf("\n\nBUSCA ORDENADA\n");
    x = buscaOrdenada(vordenado,5,elem);
    if(x == -1){
        printf("valor não encontrado");
    }
    else{
        printf("Valor encontrado no indice %d",x);
    }


    printf("\n\nBUSCA BINARIA\n");
    x = buscaBinaria(vordenado,5,elem);
    if(x == -1){
        printf("valor não encontrado");
    }
    else{
        printf("Valor encontrado no indice %d",x);
    }

    system("pause");
    system("cls");
    printf("Vetor Ordenado");
    imprimeVetor(vordenado,5);
    printf("\n\ndigite o valor a ser inserido no vetor ordenado: ");
    scanf("%d",&elem);
    insere_valor(vordenado,5,elem);
    imprimeVetor(vordenado,6);
    return 0;

}

void insere_valor(int *v, int n, int elem){
    int i, j, aux, x;
    for(i=0;i<n;i++){
        if(elem > v[i-1] && elem < v[i]){
            x = i;
            for(j=n;j > x;j--){
                aux = v[j];
                v[j] = v[j-1];
                v[j-1] = aux;
            }
            v[x] = elem;
        }
    }
    if(elem > v[n]){
        v[n] = elem;
    }
}

int buscaLinear(int *vetor, int n, int elem){
    int i;
    for(i = 0; i < n; i++){
        if(elem == vetor[i]){
            return i;
        }
    }
    return -1;
}


int buscaOrdenada(int *vetor, int n, int elem){
    int i;
    for(i = 0; i < n; i++){
        if(elem == vetor[i]){
            return i;
        }else{
            if(elem < vetor[i]){
                return -1;
            }
        }
    }
    return -1;
}


int buscaBinaria(int *vetor, int n, int elem){
    int i, inicio, meio, fim;
    inicio = 0;
    fim = n - 1;

    while(inicio <= fim){
        meio = (inicio + fim)/2;
        if(elem < vetor[meio]){
            fim = meio - 1;
        }else{
            if(elem > vetor[meio]){
                inicio = meio + 1;
            }else{
                return meio;
            }
        }
    }
    return -1;
}


void imprimeVetor(int *v, int n){
    int i;
    for(i=0;i<n;i++){
        printf("\n[%d] = %d",i,v[i]);
    }
}
