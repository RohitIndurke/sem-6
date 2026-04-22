#include<stdio.h>
int main(){
    int max=0;
    for(int i=0;i<1000;i++)
        if(i>max) max=i;

    printf("Max=%d",max);
}
