# Binary Search

## What is it?

Find a target in a sorted array; use a half-open interval to avoid off-by-one bugs.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static int binarySearch(int[] a, int x) {
    int l = 0, r = a.length - 1;
    while (l <= r) { int m = (l + r) >>> 1; if (a[m] == x) return m; if (a[m] < x) l = m + 1; else r = m - 1; }
    return -1;
}
```

## Complexity

O(log n) time, O(1) space.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
