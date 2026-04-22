#include<stdio.h>

int main(){
    int arr[1000],min=9999;

    for(int i=0;i<1000;i++){
        arr[i]=i;
        if(arr[i]<min) min=arr[i];
    }

    printf("Min = %d",min);
}
