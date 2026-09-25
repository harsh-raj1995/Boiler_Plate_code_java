# Cycle Detection

## What is it?

Use parent-aware DFS for undirected graphs and 3-color DFS for directed graphs.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static boolean undirected(int u,int p,List<Integer>[] g,boolean[] vis){vis[u]=true;for(int v:g[u]){if(v==p)continue;if(vis[v]||undirected(v,u,g,vis))return true;}return false;}
static boolean directed(int u,List<Integer>[] g,int[] color){color[u]=1;for(int v:g[u]){if(color[v]==1)return true;if(color[v]==0&&directed(v,g,color))return true;}color[u]=2;return false;}
```

## Complexity

O(n+m). Parallel undirected edges require edge IDs, not only parent vertex.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
