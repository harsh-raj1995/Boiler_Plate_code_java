# String Hashing

## What is it?

Use two independent modulus/base pairs to sharply reduce collision risk.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
// Store Hash(long h1,long h2); build two prefix/power arrays as in Rolling-Hash.
// Equal double hashes are probabilistic equality, not proof; verify if absolute certainty is required.
```

## Complexity

O(n) build and O(1) comparison.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
