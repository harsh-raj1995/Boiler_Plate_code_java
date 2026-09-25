# Lower Bound

## What is it?

First index with value >= x in a sorted array.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static int lowerBound(int[] a, int x) { int l = 0, r = a.length; while (l < r) { int m = (l+r)>>>1; if (a[m] < x) l = m+1; else r = m; } return l; }
```

## Complexity

O(log n). If answer equals length, no such value exists.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
