#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={82,170,43,140,24,16,190};
    int head=50,total=0;

    for(int i=0;i<7;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("SCAN = %d",total);
}
