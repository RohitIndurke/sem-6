#include <mpi.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 1000

int main(int argc, char *argv[])
{
    int rank, size;
    long long local_sum = 0, global_sum = 0;
    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &rank);
    MPI_Comm_size(MPI_COMM_WORLD, &size);

    int elements_per_proc = N / size;
    int *sub_array = (int*)malloc(elements_per_proc * sizeof(int));
    int *numbers = (int*)malloc(N * sizeof(int));  // Allocate on all processes

    if(rank == 0) {
        srand(time(NULL));
        for(int i = 0; i < N; i++) {
            numbers[i] = rand() % 1000;  // Generate random numbers 0-999
        }
    }

    MPI_Scatter(numbers, elements_per_proc, MPI_INT, sub_array,
                elements_per_proc, MPI_INT, 0, MPI_COMM_WORLD);

    // Calculate sum of odd numbers in sub_array
    for(int i = 0; i < elements_per_proc; i++) {
        if(sub_array[i] % 2 != 0) {  // Check if number is odd
            local_sum += sub_array[i];
        }
    }

    // Print local sum from each process
    printf("Rank %d: local_sum of odd numbers = %d\n", rank, local_sum);

    // Use MPI_SUM to sum all local sums
    MPI_Reduce(&local_sum, &global_sum, 1, MPI_LONG_LONG, MPI_SUM, 0, MPI_COMM_WORLD);

    // Barrier to synchronize all processes
    MPI_Barrier(MPI_COMM_WORLD);

    if(rank == 0) {
        printf("\n=== RESULT ===\n");
        printf("Global Sum of All Odd Numbers = %d\n", global_sum);
    }

    free(numbers);  
    free(sub_array);
    MPI_Finalize();
    return 0;
}