# 2D Prefix Sum

## What is it?

Answer static rectangle sums in O(1).

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[][] p = new long[n + 1][m + 1];
for (int i=0;i<n;i++) for (int j=0;j<m;j++) p[i+1][j+1]=a[i][j]+p[i][j+1]+p[i+1][j]-p[i][j];
long rect(int r1,int c1,int r2,int c2) { return p[r2+1][c2+1]-p[r1][c2+1]-p[r2+1][c1]+p[r1][c1]; }
```

## Complexity

Build O(nm), rectangle query O(1).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
