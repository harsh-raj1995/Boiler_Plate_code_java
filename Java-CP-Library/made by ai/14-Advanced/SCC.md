# Strongly Connected Components (Kosaraju)

## What is it?

Two DFS passes partition a directed graph into maximal mutually reachable components.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
// DFS g, append u after neighbors. Process reverse finishing order on reversed graph; each DFS is one SCC.
static void dfs(int u,List<Integer>[] g,boolean[] vis,List<Integer> order){vis[u]=true;for(int v:g[u])if(!vis[v])dfs(v,g,vis,order);order.add(u);}
// Run dfs on rg in reverse(order), assigning a component id.
```

## Complexity

O(n+m). Iterative DFS is safer on very deep graphs.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
