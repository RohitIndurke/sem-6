#include<stdio.h>
void main(){

    printf("\nEnter no of process\n");
    int n,head;
    scanf("%d",&n);
    printf("\nEnter Head\n");
    scanf("%d",&head);
    printf("\n Enter list\n");
     int q[n];
    for(int i=0;i<n;i++){
        scanf("%d",&q[i]);
    }


    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(q[j]>q[j+1]){
                int temp = q[j];
                q[j] = q[j+1];
                q[j+1] = temp;
            }
        }
    }
    printf("\nHere is sorted\n");
    for(int i=0;i<n;i++){
        printf("%d\n",q[i]);
    }
    int seekT =0;
    seekT += q[n-1] -head;
    seekT += q[n-1] -q[0];

    printf("\nHere is seek time %d and no of process %d\n",seekT,n);
}
