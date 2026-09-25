# Tree DP

## What is it?

Compute a subtree state after visiting children; root the undirected tree with a parent.

## Complete Template

```java
// Paste inside Solution or Main.
static long[] dp;static void dfs(int u,int p,List<Integer>[] g){dp[u]=1;for(int v:g[u])if(v!=p){dfs(v,u,g);dp[u]+=dp[v];}} // subtree sizes
```

## Complexity

O(n). Use iterative postorder when n can overflow the Java stack.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
