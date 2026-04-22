#include<stdio.h>
#include<stdlib.h>
void main(){
    printf("\n*----------Welcome to guess no Game----------*\n");
    int n,guess,count=0;
    n = rand();
    do{
        printf("Enter Your guess\n");
        scanf("%d",&guess);
        count++;
        if(n<guess){
            printf("Lower\n");
        }
        else if(n>guess){
            printf("Higher\n");
        }
    }while(n!=guess);
    printf("\nCongratulation you guess right in %d attempt\n",count);

}
