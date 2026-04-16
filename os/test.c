#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<mpi.h>
#include<limits.h>
#define N 1000
int main(int args,char *argv[]){
    int rank,size,local_min =INT_MAX,global_min =INT_MAX;

    MPI_Init(&args,&argv);
    MPI_Comm_size(MPI_COMM_WORLD,&size);
    MPI_Comm_rank(MPI_COMM_WORLD,&rank);

    int element_per_pros = N/size;
    int *subarray = (int*)malloc(element_per_pros * sizeof(int));
    int *number = (int*)malloc(N * sizeof(int));

    if(rank ==0){
        srand(time(NULL));
        for(int i=0;i<N;i++){
            number[i] = rand() % 100;
        }
    }

    MPI_Scatter(number,element_per_pros,MPI_INT,subarray,element_per_pros,MPI_INT,0,MPI_COMM_WORLD);

        for(int i=0;i<element_per_pros;i++){
            if(subarray[i]<local_min){
                local_min = subarray[i];
            }
        }
        printf("rank %d with min %d\n",rank,local_min);
    MPI_Reduce(&local_min,&global_min,1,MPI_INT,MPI_MIN,0,MPI_COMM_WORLD);
    MPI_Barrier(MPI_COMM_WORLD);

    if(rank == 0){
        printf("here is global %d\n",global_min);
    }
    free(number);
    free(subarray);
    MPI_Finalize();
}
