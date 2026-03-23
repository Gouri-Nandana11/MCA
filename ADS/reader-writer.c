#include <stdio.h>

int readcount = 0;
int mutex = 1;
int wrt = 1;
int data = 0;

void wait(int *s)
{
    (*s)--;
}

void signal(int *s)
{
    (*s)++;
}

void reader(int id)
{
    wait(&mutex);
    readcount++;

    if(readcount == 1)
        wait(&wrt);

    signal(&mutex);

    printf("Reader %d is reading data = %d\n", id, data);

    wait(&mutex);
    readcount--;

    if(readcount == 0)
        signal(&wrt);

    signal(&mutex);
}

void writer(int id)
{
    wait(&wrt);

    data++;
    printf("Writer %d is writing data = %d\n", id, data);

    signal(&wrt);
}

int main()
{
    reader(1);
    reader(2);
    writer(1);
    reader(3);
    writer(2);

    return 0;
}
