# Heavy Light Decomposition

## What is it?

Decompose tree paths into O(log n) contiguous positions, then query a segment tree.

## Complete Template

```java
// Paste inside Solution or Main.
// DFS computes parent, depth, size, heavy child. Decompose assigns head[u], pos[u].
static void pathQuery(int u,int v){while(head[u]!=head[v]){if(depth[head[u]]<depth[head[v]]){int t=u;u=v;v=t;} /* query segment [pos[head[u]],pos[u]] */ u=parent[head[u]];}if(depth[u]>depth[v]){int t=u;u=v;v=t;}/* query final [pos[u],pos[v]] */}
```

## Complexity

Preprocess O(n); path query O(logÂ² n) with a segment tree. Requires the declared arrays and preprocessing passes.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
