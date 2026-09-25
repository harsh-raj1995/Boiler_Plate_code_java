# Sieve and Segmented Sieve

## What is it?

Generate all primes up to n; segmented sieve handles a large interval.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
boolean[] composite=new boolean[n+1];List<Integer> primes=new ArrayList<>();for(int i=2;i<=n;i++){if(!composite[i]){primes.add(i);if((long)i*i<=n)for(int j=i*i;j<=n;j+=i)composite[j]=true;}}
// For [L,R], mark multiples of primes <= sqrt(R), starting max(p*p, ceil(L/p)*p).
```

## Complexity

Sieve O(n log log n), O(n) space.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
