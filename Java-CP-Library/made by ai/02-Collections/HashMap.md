# HashMap

## What is it?

Unordered key-value map with expected constant-time operations.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
HashMap<Integer, Integer> map = new HashMap<>(); map.put(2, 5); int x = map.getOrDefault(2, 0);
map.putIfAbsent(3, 0); map.merge(2, 1, Integer::sum); map.computeIfAbsent(4, k -> 0);
map.remove(2); boolean has = map.containsKey(3); int n = map.size();
for (var e : map.entrySet()) { int k = e.getKey(), v = e.getValue(); }
```

## Complexity

Expected put/get/remove/contains O(1); no iteration order.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
