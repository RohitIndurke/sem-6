#include<stdio.h>

int main(){
    int min=9999;
    for(int i=0;i<1000;i++){
        if(i<min) min=i;
    }

    printf("Min = %d",min);
}
