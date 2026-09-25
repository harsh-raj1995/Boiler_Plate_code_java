# HashSet

## What is it?

Unordered unique values backed by hashing.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
HashSet<Integer> set = new HashSet<>(); set.add(4); set.remove(4); boolean has = set.contains(4);
int n = set.size(); boolean empty = set.isEmpty(); for (int x : set) {}
```

## Complexity

Expected add/remove/contains O(1).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
