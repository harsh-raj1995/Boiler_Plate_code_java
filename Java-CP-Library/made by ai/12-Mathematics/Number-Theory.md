# Number Theory

## What is it?

Common formulas: phi, modular inverse, and matrix exponentiation.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long phi(long n){long r=n;for(long p=2;p*p<=n;p++)if(n%p==0){while(n%p==0)n/=p;r-=r/p;}if(n>1)r-=r/n;return r;}
long[][] mul(long[][] a,long[][] b,long mod){int n=a.length;long[][] c=new long[n][n];for(int i=0;i<n;i++)for(int k=0;k<n;k++)for(int j=0;j<n;j++)c[i][j]=(c[i][j]+a[i][k]*b[k][j])%mod;return c;}
```

## Complexity

Euler phi trial version O(sqrt n); matrix multiplication O(kÂ³).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
