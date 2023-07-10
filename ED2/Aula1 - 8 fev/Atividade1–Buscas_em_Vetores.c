#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"portuguese");

    int elem, x;
    int vordenado[] = {1,2,3,4,5};
    int vdesordenado[] = {3,4,5,2,1};

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


    printf("\n\nIMPRIMINDO VETORES\n");
    imprimeVetor(vordenado,vdesordenado,5);

    return 0;

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

void imprimeVetor(int *vo,int *vd, int n){
    int i;
    printf("\nVetor Desordenado");
    for(i=0; i < n; i++){
        printf("\n[%d] = %d",i,vd[i]);
    }
    printf("\n\nVetor Ordenado");
    for(i=0; i < n; i++){
        printf("\n[%d] = %d",i,vo[i]);
    }

}
