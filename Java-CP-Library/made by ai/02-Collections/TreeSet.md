# TreeSet

## What is it?

Sorted unique values; use navigation operations around a value.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
TreeSet<Integer> s = new TreeSet<>(); s.add(3); s.remove(3); s.contains(3);
s.first(); s.last(); s.lower(x); s.floor(x); s.ceiling(x); s.higher(x);
s.pollFirst(); s.pollLast(); for (int v : s) {}
```

## Complexity

add/remove/contains/navigation O(log n). Calling first/last on empty throws.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
