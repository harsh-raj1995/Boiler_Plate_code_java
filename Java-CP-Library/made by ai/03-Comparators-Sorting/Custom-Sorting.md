# Custom Sorting

## What is it?

Sort multiple fields safely; use counting sort when range is small.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[][] p = {{2,3},{1,9},{2,1}};
Arrays.sort(p, (a,b) -> { int c = Integer.compare(a[0], b[0]); return c != 0 ? c : Integer.compare(b[1], a[1]); });
int[] cnt = new int[maxValue + 1]; for (int x : a) cnt[x]++; // counting sort when values are 0..maxValue
```

## Complexity

Comparator sort O(n log n); counting sort O(n + range).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
