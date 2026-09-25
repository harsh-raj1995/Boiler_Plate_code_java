# Binary Search on Answer

## What is it?

Use when feasibility is monotone: false...false,true...true.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static long firstTrue(long lo, long hi) { // inclusive range; feasible(hi) must be true
    while (lo < hi) { long mid = lo + (hi - lo) / 2; if (feasible(mid)) hi = mid; else lo = mid + 1; } return lo;
}
static boolean feasible(long x) { return true; } // replace
```

## Complexity

O(log answer-range Ã— feasibility cost). Prove monotonicity and choose safe bounds.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
