# Difference Array

## What is it?

Apply many inclusive range additions, then materialize once.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[] diff = new long[n + 1];
void add(int l, int r, long v) { diff[l] += v; if (r + 1 < diff.length) diff[r + 1] -= v; }
for (int i=1;i<n;i++) diff[i] += diff[i-1];
```

## Complexity

Each update O(1), reconstruction O(n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
