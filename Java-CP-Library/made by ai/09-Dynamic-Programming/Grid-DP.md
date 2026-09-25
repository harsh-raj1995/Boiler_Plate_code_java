# Grid DP

## What is it?

State dp[r][c] answers for a cell, commonly from top and left.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long INF=Long.MAX_VALUE/4;long[][] dp=new long[R][C];for(long[] row:dp)Arrays.fill(row,INF);dp[0][0]=grid[0][0];
for(int r=0;r<R;r++)for(int c=0;c<C;c++){if(r>0)dp[r][c]=Math.min(dp[r][c],dp[r-1][c]+grid[r][c]);if(c>0)dp[r][c]=Math.min(dp[r][c],dp[r][c-1]+grid[r][c]);}
```

## Complexity

O(RC). Obstacles need explicit skip/zero/INF handling.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
