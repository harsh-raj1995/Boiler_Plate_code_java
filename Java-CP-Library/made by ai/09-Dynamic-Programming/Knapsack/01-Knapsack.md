# 0/1 Knapsack

## What is it?

Each item can be taken once. State dp[c] is best value with capacity c; iterate capacity downward.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[] dp=new long[W+1];for(int i=0;i<n;i++)for(int c=W;c>=weight[i];c--)dp[c]=Math.max(dp[c],dp[c-weight[i]]+value[i]);
```

## Complexity

O(nW), O(W) space. Descending capacity prevents reusing an item.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
