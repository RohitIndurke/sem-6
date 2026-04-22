#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={65,95,30,91,18,116,142,44,168};
    int head=52,total=0;

    for(int i=0;i<9;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("FCFS = %d",total);
}
