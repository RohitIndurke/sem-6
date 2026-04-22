#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={55,58,39,18,90,160,150,38,184};
    int head=50,total=0;

    for(int i=0;i<9;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("SSTF = %d",total);
}
