# Prefix XOR

## What is it?

XOR range query; xor is its own inverse.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] p = new int[n + 1]; for (int i=0;i<n;i++) p[i+1] = p[i] ^ a[i];
int xor(int l, int r) { return p[r+1] ^ p[l]; }
```

## Complexity

Build O(n), query O(1).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
