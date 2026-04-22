#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={24,90,133,43,188,70,37,55};
    int head=58,total=0;

    for(int i=0;i<8;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("SSTF = %d",total);
}
