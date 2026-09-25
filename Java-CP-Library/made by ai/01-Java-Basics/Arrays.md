# Arrays

## What is it?

Fixed-size primitive storage; use it for fast indexed data.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] a = {3, 1, 2};
Arrays.sort(a); Arrays.fill(a, 0);
int pos = Arrays.binarySearch(a, 2); // >=0 if found, otherwise -(insertionPoint)-1
int[] copy = Arrays.copyOfRange(a, 0, a.length);
```

## Complexity

Index/access O(1); sorting O(n log n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
