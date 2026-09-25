# Articulation Points

## What is it?

A vertex is a cut vertex when a child subtree cannot reach an earlier ancestor.

## Complete Template

```java
// Paste inside Solution or Main.
static int timer;static int[] tin,low;static boolean[] cut;
static void dfs(int u,int p,List<Integer>[] g){tin[u]=low[u]=++timer;int children=0;for(int v:g[u])if(v!=p){if(tin[v]>0)low[u]=Math.min(low[u],tin[v]);else{dfs(v,u,g);low[u]=Math.min(low[u],low[v]);if(p!=-1&&low[v]>=tin[u])cut[u]=true;children++;}}if(p==-1&&children>1)cut[u]=true;}
```

## Complexity

O(n+m). Parallel edges need edge IDs just like bridges.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
