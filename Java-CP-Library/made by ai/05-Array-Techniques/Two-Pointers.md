# Two Pointers

## What is it?

Move two indices while preserving a sorted/order-based invariant.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int l = 0, r = a.length - 1;
while (l < r) { long sum = (long)a[l] + a[r]; if (sum < target) l++; else if (sum > target) r--; else break; }
```

## Complexity

Usually O(n). For sorted pair-sum and partitioning.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
