#include<stdio.h>
int main(){
    int arr[1000],sum=0;

    for(int i=0;i<1000;i++){
        arr[i]=i;
        sum+=arr[i];
    }

    printf("Sum = %d",sum);
}
