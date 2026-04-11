#include<stdio.h>

int main(){
    int index, n, block[10];

    printf("Enter index block: ");
    scanf("%d",&index);

    printf("Enter number of blocks: ");
    scanf("%d",&n);

    printf("Enter blocks:\n");
    for(int i=0;i<n;i++)
        scanf("%d",&block[i]);

    printf("Index %d -> ",index);
    for(int i=0;i<n;i++)
        printf("%d ",block[i]);

    return 0;
}
