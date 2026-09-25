# LinkedHashMap

## What is it?

Hash map that preserves insertion order.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
LinkedHashMap<Integer, String> map = new LinkedHashMap<>(); map.put(1, "a");
map.get(1); map.remove(1); for (var e : map.entrySet()) {}
```

## Complexity

Expected map operations O(1), ordered iteration.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
