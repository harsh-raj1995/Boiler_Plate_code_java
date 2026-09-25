# Deque with ArrayDeque

## What is it?

Double-ended queue for BFS, 0-1 BFS, and monotonic windows.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
Deque<Integer> d = new ArrayDeque<>(); d.addFirst(1); d.addLast(2);
d.peekFirst(); d.peekLast(); d.pollFirst(); d.pollLast();
```

## Complexity

All end operations O(1).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
