#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={56,59,40,19,91,161,151,39,185};
    int head=48,total=0;

    for(int i=0;i<9;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("FCFS = %d",total);
}
