# Comparator

## What is it?

Defines custom order for objects and boxed values.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
record P(int x, int y) {}
Comparator<P> byXY = Comparator.comparingInt(P::x).thenComparingInt(P::y);
Comparator<P> descX = (a, b) -> Integer.compare(b.x(), a.x()); // no subtraction
```

## Complexity

Comparison sorting O(n log n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
