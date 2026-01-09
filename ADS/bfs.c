#include <stdio.h>
#include <stdlib.h>
#define max 20

int q[max];
int f = -1, r = -1;

void bfs(int cost[][max], int visited[max], int v, int start) {
    int i;

    // Initialize queue
    f = 0;
    r = 0;
    q[r] = start;
    visited[start] = 1;

    printf("\nBFS Traversal starting from vertex %d: ", start);

    while (f <= r) {
        int node = q[f++];
        printf("%d ", node);

        for (i = 1; i <= v; i++) {
            if (cost[node][i] == 1 && visited[i] == 0) {
                q[++r] = i;
                visited[i] = 1;
            }
        }
    }
    printf("\n");
}

int main() {
    int cost[max][max], visited[max];
    int v, i, j, start;

    printf("Enter the number of vertices: ");
    scanf("%d", &v);

    printf("Enter the adjacency matrix (1-based index, 0 for no edge, 1 for edge):\n");
    for (i = 1; i <= v; i++) {
        for (j = 1; j <= v; j++) {
            scanf("%d", &cost[i][j]);
        }
    }

    printf("\nThe adjacency matrix is:\n");
    for (i = 1; i <= v; i++) {
        for (j = 1; j <= v; j++) {
            printf("%d ", cost[i][j]);
        }
        printf("\n");
    }

    for (i = 1; i <= v; i++)
        visited[i] = 0;

    printf("\nEnter the starting vertex (1 to %d): ", v);
    scanf("%d", &start);

    bfs(cost, visited, v, start);

    return 0;
}
