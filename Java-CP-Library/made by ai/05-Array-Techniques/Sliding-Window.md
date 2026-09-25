# Sliding Window

## What is it?

Maintain a contiguous interval; use fixed size or shrink a valid variable window.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int l = 0; long sum = 0;
for (int r=0;r<n;r++) { sum += a[r]; while (sum > limit) sum -= a[l++]; /* window [l,r] valid */ }
```

## Complexity

O(n) if both pointers only move forward; needs a monotone validity condition.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
