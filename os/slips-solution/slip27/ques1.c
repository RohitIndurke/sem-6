#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={176,79,34,60,92,11,41,114};
    int head=65,total=0;

    for(int i=0;i<8;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("LOOK = %d",total);
}
