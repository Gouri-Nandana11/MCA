#include <stdio.h>

int main() {
    int n, i, j, u, v, ne = 1;
    int min, mincost = 0;
    int cost[10][10], visited[10] = {0};

    printf("Enter number of vertices: ");
    scanf("%d", &n);

    printf("Enter the cost adjacency matrix (0 if no edge):\n");
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= n; j++) {
            scanf("%d", &cost[i][j]);
            if (cost[i][j] == 0)
                cost[i][j] = 999; // treat 0 as infinity
        }
    }

    visited[1] = 1; // start from first vertex

    printf("\nEdges of Minimum Spanning Tree:\n");

    while (ne < n) {
        min = 999;
        for (i = 1; i <= n; i++) {
            if (visited[i] == 1) {
                for (j = 1; j <= n; j++) {
                    if (visited[j] == 0 && cost[i][j] < min) {
                        min = cost[i][j];
                        u = i;
                        v = j;
                    }
                }
            }
        }

        visited[v] = 1;
        printf("%d edge (%d, %d) = %d\n", ne, u, v, min);
        mincost += min;
        ne++;
    }

    printf("\nMinimum cost = %d\n", mincost);

    return 0;
}
