# Arrays sort

## What is it?

Sort primitive arrays or object arrays.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] a = {3,1,2}; Arrays.sort(a);
Integer[] b = {3,1,2}; Arrays.sort(b, Comparator.reverseOrder());
int[] part = Arrays.copyOfRange(a, l, r); Arrays.sort(part);
```

## Complexity

Primitive dual-pivot quicksort O(n log n) average; object sort is stable O(n log n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
