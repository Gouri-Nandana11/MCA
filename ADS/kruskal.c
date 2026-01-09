#include <stdio.h>
#include <stdlib.h>

#define MAX 10
#define INF 9999

int parent[MAX],cost[MAX][MAX];

int find(int i){
    while(parent[i] != i){
        i =parent[i];
    }
    return i;
}

int unionSet(int i,int j){
    if(i!=j){
        parent[j] = i;
        return 1;
    }
    return 0;
}

int main(){
    int i,j,n,v1,v2,u,v,edgecount = 1,c = 0, mincost = 0;
    printf("\nEnter no. of vertices: ");
    scanf("%d",&n);
    printf("\nEnter Cost adjacency matrix(0 for no edge): ");
    for(i=1;i<=n;i++)
        for(j=1;j<=n;j++){
            scanf("%d",&cost[i][j]);
            if(cost[i][j] == 0)
                cost[i][j] = INF;
        }

    for(i=1;i<=n;i++)
        parent[i] = i;

    while(edgecount < n){
        c =  INF;
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                if(cost[i][j] < c){
                    c = cost[i][j];
                    v1 = i;
                    v2=j;
                }

        u = find(v1);
        v = find(v2);

        if(unionSet(u,v)){
            printf("\n(%d ,%d)",v1,v2);
            edgecount++;
            mincost += c;
        }
        cost[v1][v2] = cost[v2][v1] = INF;
    }
    printf("\nMinimum cost = %d\n",mincost);
    return 0;
}
