#include<stdio.h>

int main(){
    int disk[50]={0}, start, len;

    printf("Enter start and length: ");
    scanf("%d%d",&start,&len);

    for(int i=start;i<start+len;i++){
        if(disk[i]==1){
            printf("Not possible");
            return 0;
        }
    }

    for(int i=start;i<start+len;i++)
        disk[i]=1;

    printf("Allocated successfully\n");

    return 0;
}
