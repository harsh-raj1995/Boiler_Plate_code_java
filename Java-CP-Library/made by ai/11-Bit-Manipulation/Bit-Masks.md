# Bit Masks

## What is it?

Represent a subset of up to about 20â€“25 items in an int.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int mask=0; mask|=1<<i; mask&=~(1<<i); boolean has=(mask&(1<<i))!=0;
for(int sub=mask;sub>0;sub=(sub-1)&mask) { /* nonempty submasks */ }
```

## Complexity

Submask enumeration over all masks is O(3^n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
