# Basic Greedy

## What is it?

Choose a locally optimal action only after identifying the invariant/exchange argument.

## Complete Template

```java
// Paste inside Solution or Main.
int reach=0;for(int i=0;i<n&&i<=reach;i++)reach=Math.max(reach,i+jump[i]);boolean possible=reach>=n-1; // Jump Game reachability
```

## Complexity

O(n) for this pattern. Check whether an early choice can block a future required choice.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
