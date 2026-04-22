#include<stdio.h>

int main(){
    int disk[50]={0}, n, i;

    printf("Enter number of blocks: ");
    scanf("%d",&n);

    printf("Allocated blocks: ");
    for(i=0;i<n;i++){
        if(disk[i]==0){
            disk[i]=1;
            printf("%d -> ",i);
        }
    }
    printf("NULL");

    return 0;
}
