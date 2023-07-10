#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"portuguese");
    int vetor[] = {2,5,4,1,3};
    printf("VETOR DESORDENADO");
    imprimeVetor(vetor,5);
    Ordena_insertionSort(vetor,5);
    printf("\n\nVETOR ORDENADO POR INSERTION SORT");
    imprimeVetor(vetor,5);
    return 0;
}

void Ordena_insertionSort(int *v, int n){
    int i, j, aux;
    for(i = 1; i < n; i++){
        aux = v[i];
        for(j = i; (j>0) && (aux < v[j-1]); j--){
            v[j] = v[j-1];
        }
        v[j] = aux;
    }
}


void imprimeVetor(int *v, int n){
    int i;
    for(i=0;i<n;i++){
        printf("\n[%d] = %d",i,v[i]);
    }

}
