#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={186,89,44,70,102,22,51,124};
    int head=70,total=0;

    for(int i=0;i<8;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("SSTF = %d",total);
}
