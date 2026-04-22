#include<stdio.h>
int main(){
    int alloc[5][4],max[5][4],need[5][4];

    for(int i=0;i<5;i++){
        for(int j=0;j<4;j++){
            need[i][j]=max[i][j]-alloc[i][j];
        }
    }

    printf("Need Matrix Calculated");
}
