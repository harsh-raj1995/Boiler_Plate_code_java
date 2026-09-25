# PriorityQueue

## What is it?

Binary min-heap by default. It is not globally sorted when iterated.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
PriorityQueue<Integer> min = new PriorityQueue<>();
PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());
PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
pq.offer(new int[]{3, 7}); pq.add(new int[]{1, 4}); pq.peek(); pq.poll();
pq.remove(); pq.element(); pq.contains(new int[]{1,4}); pq.size(); pq.isEmpty();
```

## Complexity

offer/poll O(log n), peek O(1), contains/remove(Object) O(n). Avoid `(a,b)->a-b` overflow.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
