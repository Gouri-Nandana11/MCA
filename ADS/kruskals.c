#include <stdio.h>

#define MAX 30

// Each edge has: source, destination, and weight
int src[MAX], dest[MAX], weight[MAX];
int parent[MAX];

// Find function (for union-find)
int find(int i) {
    while (parent[i] != i)
        i = parent[i];
    return i;
}

// Union function
void unionSet(int i, int j) {
    int a = find(i);
    int b = find(j);
    parent[a] = b;
}

// Sort edges by weight (simple bubble sort)
void sortEdges(int e) {
    for (int i = 0; i < e - 1; i++) {
        for (int j = 0; j < e - i - 1; j++) {
            if (weight[j] > weight[j + 1]) {
                // swap all three (src, dest, weight)
                int t = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = t;

                t = src[j];
                src[j] = src[j + 1];
                src[j + 1] = t;

                t = dest[j];
                dest[j] = dest[j + 1];
                dest[j + 1] = t;
            }
        }
    }
}

// Kruskal function
void kruskal(int v, int e) {
    int i, u, v1, ne = 0, mincost = 0;

    // Initialize each vertex as its own parent
    for (i = 0; i < v; i++)
        parent[i] = i;

    // Sort all edges by weight
    sortEdges(e);

    printf("\nEdges in the Minimum Spanning Tree:\n");

    for (i = 0; i < e && ne < v - 1; i++) {
        u = find(src[i]);
        v1 = find(dest[i]);

        if (u != v1) { // If including this edge doesn’t form a cycle
            printf("%d -- %d == %d\n", src[i], dest[i], weight[i]);
            mincost += weight[i];
            unionSet(u, v1);
            ne++;
        }
    }

    printf("Minimum Cost of MST = %d\n", mincost);
}

// Main function
int main() {
    int v, e;

    printf("Enter number of vertices and edges: ");
    scanf("%d %d", &v, &e);

    printf("Enter edges (source destination weight):\n");
    for (int i = 0; i < e; i++) {
        scanf("%d %d %d", &src[i], &dest[i], &weight[i]);
    }

    kruskal(v, e);
    return 0;
}
