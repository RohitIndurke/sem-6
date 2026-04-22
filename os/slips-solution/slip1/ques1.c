#include<stdio.h>
int main(){
    int alloc[5][3]={{2,3,2},{4,0,0},{5,0,4},{4,3,3},{2,2,4}};
    int max[5][3]={{9,7,5},{5,2,2},{1,0,4},{4,4,4},{6,5,5}};
    int need[5][3];

    for(int i=0;i<5;i++){
        for(int j=0;j<3;j++){
            need[i][j]=max[i][j]-alloc[i][j];
            printf("%d ",need[i][j]);
        }
        printf("\n");
    }
}
