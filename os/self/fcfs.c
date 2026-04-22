#include <stdio.h>
#include <math.h>
#include <stdlib.h>

void main(){
    int n, seekT = 0;
    printf("Enter number of blocks: ");
    scanf("%d", &n);
    n=n+1;
    int q[n];
    printf("Enter head position: ");
    scanf("%d", &q[0]);

    printf("Enter disk blocks: ");
    for(int i=1; i<n; i++)
        scanf("%d", &q[i]);

    for(int i=0; i<n-1; i++){
        printf("Head moved from %d -> %d\n", q[i], q[i+1]);
        seekT += abs(q[i] - q[i+1]);
    }

    printf("Total seek time = %d\n", seekT);
}
