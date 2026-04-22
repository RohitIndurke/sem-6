#include<stdio.h>
int main(){
    int n=10,bit[10];

    for(int i=0;i<n;i++)
        bit[i]=i%2;

    printf("Bit Vector:\n");
    for(int i=0;i<n;i++)
        printf("%d ",bit[i]);
}
