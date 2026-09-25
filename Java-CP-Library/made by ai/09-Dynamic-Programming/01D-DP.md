# 1D DP

## What is it?

Use when state depends on a prefix position. State: dp[i] = best answer for first i items; establish dp[0] before transitions.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[] dp=new long[n+1];Arrays.fill(dp,Long.MAX_VALUE/4);dp[0]=0;
for(int i=1;i<=n;i++){ dp[i]=dp[i-1]+cost[i-1]; /* add valid transitions from earlier states */ }
// Space optimization: retain only previous state(s) if dp[i] does not need older values.
```

## Complexity

Usually O(n Ã— transitions). Recognition clue: answer naturally progresses left to right.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
