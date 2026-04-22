#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={33,99,142,52,197,79,46,65};
    int head=72,total=0;

    for(int i=0;i<8;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("C-SCAN = %d",total);
}
