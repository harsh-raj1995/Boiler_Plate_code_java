# Rerooting DP

## What is it?

Compute a value rooted at every node by passing parent-side contribution to children.

## Complete Template

```java
// Paste inside Solution or Main.
// For sum of distances: first dfs gets size[u] and down[u]=sum distances within subtree.
// Second dfs: all[v] = all[u] - size[v] + (n - size[v]) for child v of u.
static void reroot(int u,int p,List<Integer>[] g,int[] size,long[] all,int n){for(int v:g[u])if(v!=p){all[v]=all[u]-size[v]+(n-size[v]);reroot(v,u,g,size,all,n);}}
```

## Complexity

O(n) when each directed edge is processed O(1). Define exactly what parent contribution means.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
