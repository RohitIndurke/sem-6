#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void main(){
    int n;
    printf("Enter the no\n");
    scanf("%d",&n);
    n=n+1;
    int q[n];
    printf("Enter head position\n");
    scanf("%d",&q[0]);

    printf("Enter rest o digits\n");
     for(int i = 1;i<n;i++){
         scanf("%d",&q[i]);
     }

     int skt =0;
     for(int i=0;i<n-1;i++){
         printf("Moved from %d to %d\n",q[i],q[i+1]);
         skt += abs(q[i]- q[i+1]);
     }
     printf("here is skeektime %d\n",skt);
}
