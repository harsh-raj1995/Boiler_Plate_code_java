# Subsets

## What is it?

Enumerate all masks or build subsets recursively.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
for(int mask=0;mask<(1<<n);mask++){for(int i=0;i<n;i++)if((mask&(1<<i))!=0){/* choose i */}}
```

## Complexity

O(nÂ·2^n) to inspect every selected element.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
