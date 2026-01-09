#include<stdio.h>
#define max 10
int adj[max][max],stk[max],top=-1;
void dfs(int adj[max][max], int visited[],int start,int n)
{
    top=0;
    stk[top]=start;
    visited[start]=1;
    printf("dfs traversal from %d :",start);

    while(top>=0){
        int value=stk[top--];
        printf(" %d",value);
         for (int i = 0; i <n; i++) {
            if (adj[value][i] == 1 && visited[i] == 0) {
                stk[++top] = i;
                visited[i] = 1;
            }
        }
    }
}

int main(){
    int n,visited[max],start;
    printf("enter thr number of elemts\n");
    scanf("%d",&n);
    printf("Enter the adjacency matrix\n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            scanf("%d",&adj[i][j]);
        }
    }
    for(int i=0;i<n;i++){
        visited[i]=0;
    }
    printf("enter the starting vertex(0-%d)",n);
    scanf("%d",&start);
    dfs(adj, visited, start, n);

    return 0;
}