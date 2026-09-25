# BitSet

## What is it?

Dynamic bit set from the standard library; useful for dense boolean DP or reachability.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
BitSet b=new BitSet(n);b.set(i);b.clear(i);boolean on=b.get(i);b.flip(l,r);b.or(other);b.and(other);
int first=b.nextSetBit(0); int count=b.cardinality();
```

## Complexity

Word-parallel operations are roughly O(n/64).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
