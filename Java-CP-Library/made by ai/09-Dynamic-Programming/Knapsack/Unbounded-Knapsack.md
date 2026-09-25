# Unbounded Knapsack

## What is it?

Each item can be used repeatedly; iterate capacity upward.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[] dp=new long[W+1];for(int i=0;i<n;i++)for(int c=weight[i];c<=W;c++)dp[c]=Math.max(dp[c],dp[c-weight[i]]+value[i]);
```

## Complexity

O(nW), O(W) space. Ascending capacity deliberately allows reuse.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
