# ArrayList

## What is it?

Resizable random-access list. Generic syntax: `ArrayList<Integer>`.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
ArrayList<Integer> a = new ArrayList<>(); a.add(5); a.add(0, 3);
int x = a.get(0); a.set(0, 9); a.remove(0); a.remove(Integer.valueOf(9));
boolean has = a.contains(5); int n = a.size(); boolean empty = a.isEmpty();
for (int v : a) {} Collections.sort(a);
```

## Complexity

get/set O(1), append amortized O(1), middle insert/remove O(n), contains O(n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
