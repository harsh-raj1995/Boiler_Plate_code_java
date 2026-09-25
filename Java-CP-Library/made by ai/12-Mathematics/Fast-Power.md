# Fast Power

## What is it?

Binary exponentiation; use it for powers and modular powers.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static long modPow(long a,long e,long mod){long r=1%mod;for(a%=mod;e>0;e>>=1,a=a*a%mod)if((e&1)==1)r=r*a%mod;return r;}
// a*a may overflow long for mod near 1e18; use BigInteger or safe multiplication then.
```

## Complexity

O(log exponent).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
