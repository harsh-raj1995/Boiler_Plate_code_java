# Floyd Warshall

## What is it?

All-pairs shortest path for small dense graphs.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
for(int k=0;k<n;k++) for(int i=0;i<n;i++) if(d[i][k]<INF) for(int j=0;j<n;j++) if(d[k][j]<INF) d[i][j]=Math.min(d[i][j],d[i][k]+d[k][j]);
// initialize d[i][i]=0 and d[u][v]=min(d[u][v], w)
```

## Complexity

O(nÂ³) time, O(nÂ²) space. INF must leave headroom for addition.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
