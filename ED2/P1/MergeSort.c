
void merge(int v[], int left, int middle, int right) {
    int helper[right+1];
    for (int i = left; i <= right; i++) {
        helper[i] = v[i];
    }

    int i = left;
    int j = middle + 1;
    int k = left;

    while (i <= middle && j <= right) {
        if (helper[i] <= helper[j]) {
            v[k] = helper[i];
            i++;
        } else {
            v[k] = helper[j];
            j++;
        }
        k++;
    }

    //verifica se a metade inicial nao foi consumida
    while (i <= middle) {
        v[k] = helper[i];
        i++;
        k++;
        printf("\nAppend de i");
    }

    //verifica se a metade final nao foi consumida
    while (j <= right) {
        v[k] = helper[j];
        j++;
        k++;
        printf("\nAppend de j");
    }
}

void mergeSort(int v[], int left, int right) {
    int i = 0;
    if (left >= right)
        return;

    else {
        int middle = (left + right) / 2;
        mergeSort(v, left, middle);
        mergeSort(v, middle + 1, right);
        merge(v, left, middle, right);
    }
}

int main(){

    int v[] = {5,4,3,2,1};
    int i = 0;
    for(i=0;i<5;i++){
        printf("%d",v[i]);
    }

    int left = 0;
    int right = (sizeof(v) / sizeof(v[0])) - 1;
    mergeSort(v, left, right);

    printf("\n");
    for(i=0;i<5;i++){
        printf("%d",v[i]);
    }
    return 0;

}




