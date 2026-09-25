# Linear Search

## What is it?

Scan unsorted values or use a predicate.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static int find(int[] a, int x) { for (int i = 0; i < a.length; i++) if (a[i] == x) return i; return -1; }
```

## Complexity

O(n) time, O(1) space.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
