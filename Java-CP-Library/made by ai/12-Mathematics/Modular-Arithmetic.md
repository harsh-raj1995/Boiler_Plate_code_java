# Modular Arithmetic

## What is it?

Normalize after subtraction; inverse via Fermat only for prime mod.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static final long MOD=1_000_000_007L;
long add=(a+b)%MOD, sub=(a-b+MOD)%MOD, mul=a*b%MOD;
long inv=modPow(a,MOD-2,MOD); // only when MOD prime and a not divisible by MOD
```

## Complexity

Each operation O(1); inverse power O(log MOD).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
