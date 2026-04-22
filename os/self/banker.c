#include<stdio.h>

int main(){
    int n,m,i,j,k;

    printf("Enter processes and resources: ");
    scanf("%d%d",&n,&m);

    int alloc[n][m], max[n][m], need[n][m], avail[m], finish[n];

    printf("Enter Allocation:\n");
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            scanf("%d",&alloc[i][j]);

    printf("Enter Max:\n");
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            scanf("%d",&max[i][j]);

    printf("Enter Available:\n");
    for(j=0;j<m;j++)
        scanf("%d",&avail[j]);

    // Need = Max - Allocation
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            need[i][j] = max[i][j] - alloc[i][j];

    for(i=0;i<n;i++) finish[i]=0;

    printf("Safe sequence: ");

    for(k=0;k<n;k++){
        for(i=0;i<n;i++){
            if(finish[i]==0){
                int flag=0;
                for(j=0;j<m;j++){
                    if(need[i][j] > avail[j]){
                        flag=1; break;
                    }
                }
                if(flag==0){
                    printf("P%d ",i);
                    for(j=0;j<m;j++)
                        avail[j]+=alloc[i][j];
                    finish[i]=1;
                }
            }
        }
    }

    return 0;
}
