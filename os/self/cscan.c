#include <stdio.h>

void main(){
    int n;
    printf("Enter length of queue: ");
    scanf("%d", &n);

    int q[n], head, start, end, seekT = 0, dir;

    printf("Enter head, start, end, dir(1=right,0=left): ");
    scanf("%d%d%d%d", &head, &start, &end, &dir);

    printf("Enter elements:\n");
    for(int i=0; i<n; i++)
        scanf("%d", &q[i]);

    // sort
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (q[j] > q[j + 1]) {
                int temp = q[j];
                q[j] = q[j + 1];
                q[j + 1] = temp;
            }
        }
    }

    printf("Sorted:\n");
    for(int i=0;i<n;i++)
        printf("%d ", q[i]);

    printf("\n");

    if(dir == 0){ // LEFT ✅

        int afterE = end;  // safe default

        for(int i=0;i<n;i++){
            if(q[i] > head){
                afterE = q[i];
                break;
            }
        }

        seekT = (head - start) + (end - start) + (end - afterE);
    }
    else{ // RIGHT ✅

        int beforeE = start; // safe default

        for(int i=0;i<n;i++){
            if(q[i] > head){
                if(i > 0)
                    beforeE = q[i-1];
                break;
            }
        }

        seekT = (end - head) + (end - start) + (beforeE - start);
    }

    printf("Seek time = %d\n", seekT);
}
