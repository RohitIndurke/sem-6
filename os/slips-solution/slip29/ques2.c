#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={80,150,60,135,40,35,170};
    int head=70,total=0;

    for(int i=0;i<7;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("C-LOOK = %d",total);
}
