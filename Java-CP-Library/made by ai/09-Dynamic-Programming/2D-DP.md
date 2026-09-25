# 2D DP

## What is it?

Use two dimensions when two prefixes/coordinates/state variables interact. Define every index precisely.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[][] dp=new long[n+1][m+1];
// initialize base row/column before this loop
for(int i=1;i<=n;i++)for(int j=1;j<=m;j++)dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
// Often compress rows: keep previous and current arrays when transition only reads row i-1.
```

## Complexity

O(nm) time/space; iterate in dependency order.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
