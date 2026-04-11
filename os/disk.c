#include <stdio.h>
#include <stdlib.h>

void sort(int arr[], int n) {
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j] > arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
            }
        }
    }
}

int main() {
    int n, head, choice;

    printf("Enter number of requests: ");
    scanf("%d", &n);

    int req[n];
    printf("Enter requests:\n");
    for(int i=0;i<n;i++) scanf("%d",&req[i]);

    printf("Enter head: ");
    scanf("%d",&head);

    printf("\n1.FCFS  2.SSTF  3.SCAN  4.C-SCAN  5.C-LOOK\n");
    scanf("%d",&choice);

    int seek = 0;

    // ---------------- FCFS ----------------
    if(choice == 1){
        printf("FCFS: ");
        for(int i=0;i<n;i++){
            printf("%d ", req[i]);
            seek += abs(head - req[i]);
            head = req[i];
        }
    }

    // ---------------- SSTF ----------------
    else if(choice == 2){
        int visited[n];
        for(int i=0;i<n;i++) visited[i]=0;

        printf("SSTF: ");
        for(int i=0;i<n;i++){
            int min=9999, index=-1;

            for(int j=0;j<n;j++){
                if(!visited[j]){
                    int dist = abs(head - req[j]);
                    if(dist < min){
                        min = dist;
                        index = j;
                    }
                }
            }

            visited[index]=1;
            printf("%d ", req[index]);
            seek += abs(head - req[index]);
            head = req[index];
        }
    }

    // ---------------- SCAN ----------------
    else if(choice == 3){
        int dir;
        printf("Direction (0=Left,1=Right): ");
        scanf("%d",&dir);

        sort(req,n);

        int pos;
        for(pos=0;pos<n;pos++){
            if(req[pos]>=head){
            break;
            }

        }


    printf("SCAN: ");

        if(dir==1){ // right
            for(int i=pos;i<n;i++){
                printf("%d ",req[i]);
                seek += abs(head - req[i]);
                head=req[i];
            }
            for(int i=pos-1;i>=0;i--){
                printf("%d ",req[i]);
                seek += abs(head - req[i]);
                head=req[i];
            }
        } else { // left
            for(int i=pos-1;i>=0;i--){
                printf("%d ",req[i]);
                seek += abs(head - req[i]);
                head=req[i];
            }
            for(int i=pos;i<n;i++){
                printf("%d ",req[i]);
                seek += abs(head - req[i]);
                head=req[i];
            }
        }
    }

    // ---------------- C-SCAN ----------------
    else if(choice == 4){
        sort(req,n);

        printf("C-SCAN: ");

        int pos;
        for(pos=0;pos<n;pos++)
            if(req[pos]>=head) break;

        // move right
        for(int i=pos;i<n;i++){
            printf("%d ",req[i]);
            seek += abs(head - req[i]);
            head=req[i];
        }

        // jump to beginning
        for(int i=0;i<pos;i++){
            printf("%d ",req[i]);
            seek += abs(head - req[i]);
            head=req[i];
        }
    }

    // ---------------- C-LOOK ----------------
    else if(choice == 5){
        sort(req,n);

        printf("C-LOOK: ");

        int pos;
        for(pos=0;pos<n;pos++)
            if(req[pos]>=head) break;

        // move right
        for(int i=pos;i<n;i++){
            printf("%d ",req[i]);
            seek += abs(head - req[i]);
            head=req[i];
        }

        // jump to lowest request (not 0)
        for(int i=0;i<pos;i++){
            printf("%d ",req[i]);
            seek += abs(head - req[i]);
            head=req[i];
        }
    }

    printf("\nTotal Seek Time = %d\n", seek);

    return 0;
}
