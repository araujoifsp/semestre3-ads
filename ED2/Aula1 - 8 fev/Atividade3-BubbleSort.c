#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"portuguese");

    int vetor[] = {5,3,1,2,4};

    printf("VETOR DESORDENADO");
    imprimeVetor(vetor,5);

    Ordena_bubbleSort(vetor,5);
    printf("\n\nVETOR ORDENADO POR BUUBLESORT");
    imprimeVetor(vetor,5);

    return 0;

}


void Ordena_bubbleSort(int *v, int n){
    int i, continua, aux, fim = n;
    do{
        continua = 0;
        for(i = 0; i < fim - 1; i++){
            if(v[i] > v[i+1]){
                aux = v[i];
                v[i] = v[i+1];
                v[i+1] = aux;
                continua = i;
            }
        }
        fim--;
    }while(continua != 0);
}


void imprimeVetor(int *v, int n){
    int i;
    for(i=0;i<n;i++){
        printf("\n[%d] = %d",i,v[i]);
    }
}
