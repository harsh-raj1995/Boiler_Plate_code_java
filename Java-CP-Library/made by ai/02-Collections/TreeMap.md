# TreeMap

## What is it?

Sorted key-value map (red-black tree); ideal for predecessor/successor queries.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
TreeMap<Integer, String> m = new TreeMap<>(); m.put(3, "x"); m.get(3); m.remove(3); m.containsKey(3);
m.firstKey(); m.lastKey(); m.lowerKey(x); m.floorKey(x); m.ceilingKey(x); m.higherKey(x);
m.firstEntry(); m.lastEntry(); m.pollFirstEntry(); m.pollLastEntry();
for (var e : m.entrySet()) {}
```

## Complexity

put/get/remove/navigable queries O(log n). Keys must be comparable or have a comparator.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
