# Combinations nCr

## What is it?

Precompute factorial and inverse factorial modulo a prime.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[] fact=new long[N+1],invFact=new long[N+1];fact[0]=1;for(int i=1;i<=N;i++)fact[i]=fact[i-1]*i%MOD;invFact[N]=modPow(fact[N],MOD-2,MOD);for(int i=N;i>0;i--)invFact[i-1]=invFact[i]*i%MOD;
long nCr(int n,int r){return r<0||r>n?0:fact[n]*invFact[r]%MOD*invFact[n-r]%MOD;}
```

## Complexity

Precompute O(N+log MOD), each nCr O(1); MOD must be prime for this inverse method.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
