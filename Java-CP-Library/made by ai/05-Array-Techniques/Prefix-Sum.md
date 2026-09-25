# Prefix Sum

## What is it?

Precompute range sums of static arrays.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[] pref = new long[n + 1];
for (int i = 0; i < n; i++) pref[i + 1] = pref[i] + a[i];
long sum(int l, int r) { return pref[r + 1] - pref[l]; } // inclusive l,r
```

## Complexity

Build O(n), each range sum O(1); use long.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
