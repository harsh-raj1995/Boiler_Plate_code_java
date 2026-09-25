# Fenwick Range Update

## What is it?

A Fenwick over differences supports range add plus point query.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class RangeAdd {
    Fenwick bit; RangeAdd(int n) { bit = new Fenwick(n + 1); }
    void add(int l,int r,long v) { bit.add(l,v); bit.add(r+1,-v); }
    long get(int i) { return bit.sumPrefix(i); }
}
// For range-add/range-sum use two BITs: prefix(x) = sum(B1,x)*x - sum(B2,x).
```

## Complexity

Range update and point query O(log n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
