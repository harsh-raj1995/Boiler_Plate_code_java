# Subset Sum

## What is it?

Boolean dp[s] says whether sum s is reachable using processed items.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
boolean[] dp=new boolean[target+1];dp[0]=true;for(int x:a)for(int s=target;s>=x;s--)dp[s]|=dp[s-x];
```

## Complexity

O(nÂ·target). Descend to use each number at most once.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
