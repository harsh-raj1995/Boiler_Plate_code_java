# LinkedHashSet

## What is it?

Hash set that preserves insertion order.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
LinkedHashSet<Integer> set = new LinkedHashSet<>(); set.add(1); set.remove(1); set.contains(1);
for (int x : set) {}
```

## Complexity

Expected operations O(1), ordered iteration.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
