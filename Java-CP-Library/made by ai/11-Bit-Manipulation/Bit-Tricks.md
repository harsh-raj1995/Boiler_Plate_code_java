# Bit Tricks

## What is it?

Useful identities: clear lowest set bit and extract lowbit.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int lowbit = x & -x; int cleared = x & (x - 1);
int nextPowerOfTwo = Integer.highestOneBit(x - 1) << 1; // x>1; beware overflow
int xorAll = 0; for(int v:a) xorAll ^= v;
```

## Complexity

O(1) per expression. Do not use signed comparisons for unsigned bit patterns.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
