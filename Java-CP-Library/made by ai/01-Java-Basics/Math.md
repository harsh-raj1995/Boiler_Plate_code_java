# Math

## What is it?

Standard numeric helpers; write custom GCD for Java 17 compatibility.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long g(long a, long b) { while (b != 0) { long t = a % b; a = b; b = t; } return Math.abs(a); }
long lcm(long a, long b) { return a / g(a, b) * b; } // product can overflow long
long floor = Math.floorDiv(a, b); // Java 17
long ceilDiv(long a, long b) { return -Math.floorDiv(-a, b); } // b != 0; works with negative values except MIN_VALUE/-1 overflow
int z = Math.max(a, b);
```

## Complexity

Usually O(n) time and O(1) extra space unless the template states otherwise.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
