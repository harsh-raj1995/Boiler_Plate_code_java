# Kruskal MST

## What is it?

Sort edges and add an edge when it joins two DSU components.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
edges.sort(Comparator.comparingLong(Edge::w)); DSU dsu=new DSU(n); long total=0;int used=0;
for(Edge e:edges) if(dsu.union(e.u(),e.v())) { total+=e.w(); if(++used==n-1)break; }
boolean connected = used==n-1;
```

## Complexity

O(m log m); returns a minimum spanning forest if disconnected.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
