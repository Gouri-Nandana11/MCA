#include <stdio.h>

int semaphore = 1;   // Binary semaphore
int shared = 0;      // Shared variable

void wait()
{
    while(semaphore <= 0);   // Busy waiting
    semaphore--;             // Enter critical section
}

void signal()
{
    semaphore++;             // Leave critical section
}

void process(int id)
{
    wait();   // Request entry

    printf("Process %d entering critical section\n", id);

    shared++;
    printf("Shared value = %d\n", shared);

    printf("Process %d leaving critical section\n", id);

    signal();  // Release critical section
}

int main()
{
    process(1);
    process(2);
    process(3);

    return 0;
}
