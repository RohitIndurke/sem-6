#include<stdio.h>

int main(){
    int alloc[5][3]={{0,1,0},{2,0,0},{3,0,3},{2,1,1},{0,0,2}};
    int max[5][3]={{0,0,0},{2,0,2},{0,0,0},{1,0,0},{0,0,2}};
    int need[5][3];

    for(int i=0;i<5;i++){
        for(int j=0;j<3;j++){
            need[i][j]=max[i][j]-alloc[i][j];
            printf("%d ",need[i][j]);
        }
        printf("\n");
    }
}
