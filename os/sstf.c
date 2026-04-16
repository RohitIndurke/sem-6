#include <stdio.h>
#include <stdlib.h>

int main(){
    int n, head, totalSeek = 0;

    printf("Enter number of requests: ");
    scanf("%d", &n);

    int q[n], visited[n];

    printf("Enter disk requests:\n");
    for(int i = 0; i < n; i++){
        scanf("%d", &q[i]);
        visited[i] = 0;   // initialize
    }

    printf("Enter head position: ");
    scanf("%d", &head);

    printf("\nOrder of servicing:\n");

    for(int i = 0; i < n; i++){
        int closest = -1;
        int minDistance = 9999;
        // find closest unvisited
        for(int j = 0; j < n; j++){
            if(!visited[j]){
                int dist = abs(q[j] - head);

                if(dist < minDistance){
                    minDistance = dist;
                    closest = j;
                }
            }
        }
        // move head
        visited[closest] = 1;
        totalSeek += minDistance;

        printf("%d -> ", q[closest]);

        head = q[closest];
    }

    printf("\nTotal head movement = %d\n", totalSeek);
}
