# Collections sort

## What is it?

Sort mutable lists in place.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
List<Integer> a = new ArrayList<>(List.of(3, 1, 2));
Collections.sort(a); a.sort(Comparator.reverseOrder()); Collections.reverse(a);
```

## Complexity

TimSort O(n log n), stable.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
