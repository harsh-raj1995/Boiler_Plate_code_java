# LinkedList

## What is it?

Doubly linked list; usually prefer ArrayDeque for queue/deque work.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
LinkedList<Integer> q = new LinkedList<>(); q.add(1); q.addFirst(0); q.addLast(2);
int first = q.getFirst(); q.removeFirst(); q.removeLast(); boolean has = q.contains(1);
for (int v : q) {}
```

## Complexity

End operations O(1); indexed access/search O(n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
