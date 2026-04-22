#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={23,89,132,42,187,69,36,55};
    int head=40,total=0;

    for(int i=0;i<8;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("C-LOOK = %d",total);
}
