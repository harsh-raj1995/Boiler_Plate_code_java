# Interval DP

## What is it?

State dp[l][r] answers an interval; iterate increasing length so smaller intervals are ready.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[][] dp=new long[n][n];for(int len=2;len<=n;len++)for(int l=0;l+len<=n;l++){int r=l+len-1;dp[l][r]=Long.MAX_VALUE/4;for(int k=l;k<r;k++)dp[l][r]=Math.min(dp[l][r],dp[l][k]+dp[k+1][r]);}
```

## Complexity

Often O(nÂ³). Recognition clue: choose a split/last operation inside a subarray.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
