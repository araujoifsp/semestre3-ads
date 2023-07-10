#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"portuguese");

    int vetor[] = {3,1,4,5,2};

    printf("Vetor desordenado");
    imprimeVetor(vetor,5);
    Ordena_seletionSort(vetor,5);
    printf("\n\nVetor ordenado por selectionSort");
    imprimeVetor(vetor,5);

    return 0;
}

void imprimeVetor(int *v, int n){
    int i;
    for(i=0;i<n;i++){
        printf("\n[%d] = %d",i,v[i]);
    }

}

void Ordena_seletionSort(int *v, int n){
    int i, j, menor, troca;
    for(i = 0; i < n -1; i++){
        menor = i;
        for(j = i+ 1; j < n; j++){
            if(v[j] < v[menor]){
                menor = j;
            }
        }
        if(i != menor){
            troca = v[i];
            v[i] = v[menor];
            v[menor] = troca;
        }
    }
}
