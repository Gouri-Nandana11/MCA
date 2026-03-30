#include <stdio.h>
#include <unistd.h>
#include <pthread.h>

// Thread function
void* myThread(void* arg) {
    printf("Thread is running inside process...\n");
    return NULL;
}

int main() {
    pid_t pid;
    pthread_t t1;

    pid = fork();  // create process

    if (pid == 0) {
        // Child process
        printf("This is Child Process\n");

        pthread_create(&t1, NULL, myThread, NULL); // create thread
        pthread_join(t1, NULL); // wait for thread

    } else if (pid > 0) {
        // Parent process
        printf("This is Parent Process\n");

        pthread_create(&t1, NULL, myThread, NULL); // create thread
        pthread_join(t1, NULL); // wait for thread

    } else {
        printf("Fork failed\n");
    }

    return 0;
}
