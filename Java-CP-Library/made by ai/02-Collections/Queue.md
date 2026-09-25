# Queue with ArrayDeque

## What is it?

FIFO queue for BFS.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
Queue<Integer> q = new ArrayDeque<>(); q.offer(1); int front = q.peek(); int x = q.poll();
q.add(2); q.remove(); q.element(); // add/remove/element throw on failure/empty
```

## Complexity

offer/poll/peek O(1).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
