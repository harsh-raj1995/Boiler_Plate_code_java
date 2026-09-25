# Adjacency List

## What is it?

Best default sparse-graph representation; include a weight in an edge record for weighted graphs.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
record Edge(int to, long w) {}
List<Integer>[] g = new ArrayList[n]; for(int i=0;i<n;i++) g[i]=new ArrayList<>();
g[u].add(v); g[v].add(u); // omit reverse edge if directed
List<Edge>[] wg = new ArrayList[n]; for(int i=0;i<n;i++) wg[i]=new ArrayList<>();
wg[u].add(new Edge(v,w));
```

## Complexity

Memory O(n+m), traversal O(n+m).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
