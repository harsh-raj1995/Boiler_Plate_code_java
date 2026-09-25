# Bridges

## What is it?

Tarjan low-link values identify edges whose removal disconnects an undirected graph.

## Complete Template

```java
// Paste inside Solution or Main.
static int timer;static int[] tin,low;static boolean[] bridge;
static void dfs(int u,int parentEdge,List<int[]>[] g){tin[u]=low[u]=++timer;for(int[] e:g[u]){int v=e[0],id=e[1];if(id==parentEdge)continue;if(tin[v]>0)low[u]=Math.min(low[u],tin[v]);else{dfs(v,id,g);low[u]=Math.min(low[u],low[v]);if(low[v]>tin[u])bridge[id]=true;}}}
```

## Complexity

O(n+m). Pass parent edge ID, not parent vertex, so parallel edges work.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
