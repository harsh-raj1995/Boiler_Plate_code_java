# Bitmask DP

## What is it?

State dp[mask][last] represents an answer for chosen subset and endpoint.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int full=1<<n;long[][] dp=new long[full][n];for(long[] row:dp)Arrays.fill(row,Long.MAX_VALUE/4);dp[1<<start][start]=0;
for(int mask=0;mask<full;mask++)for(int u=0;u<n;u++)if(dp[mask][u]<Long.MAX_VALUE/4)for(int v=0;v<n;v++)if((mask&(1<<v))==0)dp[mask|1<<v][v]=Math.min(dp[mask|1<<v][v],dp[mask][u]+w[u][v]);
```

## Complexity

O(nÂ²2^n); practical near n<=20.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
