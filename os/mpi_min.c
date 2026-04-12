#include <mpi.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <limits.h>
#define N 1000

int main(int argc, char *argv[])
{
    int rank, size, local_min = INT_MAX, global_min = INT_MAX;
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    int elements_per_proc = N / size;
    int *sub_array = (int*)malloc(elements_per_proc * sizeof(int));
    int *numbers = (int*)malloc(N * sizeof(int));  // Allocate on all processes

    if(rank == 0) {
        srand(time(NULL));
        for(int i = 0; i < N; i++) {
            numbers[i] = rand() % 100;
        }
    }

    MPI_Scatter(numbers, elements_per_proc, MPI_INT, sub_array,
                elements_per_proc, MPI_INT, 0, MPI_COMM_WORLD);

    for(int i = 0; i < elements_per_proc; i++) {
        if(sub_array[i] < local_min)
            local_min = sub_array[i];
    }

    // Use MPI_MIN instead of MPI_MAX to find minimum
    MPI_Reduce(&local_min, &global_min, 1, MPI_INT, MPI_MIN, 0, MPI_COMM_WORLD);

    if(rank == 0) {
        printf("Global Min = %d\n", global_min);
    }

    free(numbers);
    free(sub_array);
    MPI_Finalize();
    return 0;
}
