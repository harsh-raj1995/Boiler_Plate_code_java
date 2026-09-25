# Adjacency Matrix

## What is it?

Dense graph representation; O(1) edge lookup, expensive memory.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
boolean[][] edge = new boolean[n][n]; edge[u][v] = true;
long INF = Long.MAX_VALUE / 4; long[][] w = new long[n][n];
for(int i=0;i<n;i++) { Arrays.fill(w[i], INF); w[i][i]=0; }
```

## Complexity

Memory O(nÂ²); scan neighbors O(n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
