#include<stdio.h>

void main(){
    int n,start,end,head,dir,seekT=0;
    printf("\nEnter the no of element in array\n");
    scanf("%d",&n);
    printf("\nEnter Start End Head\n Dir right:1 left:0\n");
    scanf("%d%d%d%d",&start,&end,&head,&dir);
    printf("\nNow enter elements ");
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

    for(int i=0;i<n;i++){
        printf("%d ",q[i]);
    }

    if(dir==0){
        seekT += (head - start) + (q[n-1] - start);
        printf("\nHere is seek %d \n",seekT);
    }
    else{
        seekT +=(end - head)+(end - q[0]);
         printf("\nHere is seek %d \n",seekT);
    }
}
