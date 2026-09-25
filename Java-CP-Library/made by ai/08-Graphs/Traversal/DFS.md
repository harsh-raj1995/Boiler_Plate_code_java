# DFS and Iterative DFS

## What is it?

Depth-first traversal for components, cycle checks, and subtree work.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static void dfs(int u, List<Integer>[] g, boolean[] vis) { vis[u]=true; for(int v:g[u]) if(!vis[v]) dfs(v,g,vis); }
static void iterativeDfs(int s,List<Integer>[] g,boolean[] vis){ ArrayDeque<Integer> st=new ArrayDeque<>();st.push(s);vis[s]=true;while(!st.isEmpty()){int u=st.pop();for(int v:g[u])if(!vis[v]){vis[v]=true;st.push(v);}} }
int components=0; for(int i=0;i<n;i++) if(!vis[i]) { components++; dfs(i,g,vis); }
```

## Complexity

O(n+m). Prefer iterative DFS for a deep path to avoid stack overflow.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
