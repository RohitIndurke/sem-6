#include<stdio.h>

void main(){
int n,head;
int headindex;

printf("\nEnter the No of process\n");
scanf("%d",&n);

printf("\nEnter Head\n");
scanf("%d",&head);
printf("Enter list");
int q[n];
    for(int i=0;i<n;i++){
        scanf("%d",&q[i]);
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(q[j] > q[j+1]){
                int temp = q[j];
                q[j] = q[j+1];
                q[j+1] = temp;
            }
        }
    }

    printf("\nHere is sorted array\n");
    for(int i=0;i<n;i++){
        printf("%d ",q[i]);

        if(q[i] < head && head < q[i+1]){
            headindex = i;
        }
    }

    int seekT = 0;
    seekT += q[n-1] - head;
    seekT += q[n-1] - q[0];
    seekT += q[headindex] - q[0];

    printf("\nHere is Seek time %d ms and No of process %d\n",seekT,n);

}
