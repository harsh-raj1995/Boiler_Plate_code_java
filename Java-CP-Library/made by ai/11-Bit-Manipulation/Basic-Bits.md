# Basic Bits

## What is it?

Bit operations are fast for flags, parity, and subsets. Use long shifts for bits >=31.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int parity=x&1, shifted=x<<k, signed=x>>k, unsigned=x>>>k;
boolean set=(x&(1<<k))!=0; x|=1<<k; x&=~(1<<k); x^=1<<k;
int low=x&-x; int count=Integer.bitCount(x); int high=Integer.highestOneBit(x);
boolean power=x>0&&(x&(x-1))==0;
```

## Complexity

All shown operations O(1). `>>` sign-extends; `>>>` fills with zero.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
