#include<stdio.h>
#include<stdlib.h>

int main(){
    int req[]={86,147,91,170,95,130,102,70};
    int head=125,total=0;

    for(int i=0;i<8;i++){
        total+=abs(req[i]-head);
        head=req[i];
    }

    printf("LOOK = %d",total);
}
