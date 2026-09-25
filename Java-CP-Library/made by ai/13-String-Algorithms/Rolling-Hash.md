# Rolling Hash

## What is it?

Polynomial prefix hash supports O(1) substring comparisons after preprocessing. Hash collisions are possible.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static final long MOD=1_000_000_007L, BASE=911382323L;
long[] h=new long[s.length()+1],pow=new long[s.length()+1];pow[0]=1;for(int i=0;i<s.length();i++){h[i+1]=(h[i]*BASE+s.charAt(i))%MOD;pow[i+1]=pow[i]*BASE%MOD;}
long hash(int l,int r){return (h[r]-h[l]*pow[r-l]%MOD+MOD)%MOD;} // [l,r)
```

## Complexity

Build O(n), substring hash O(1). Use double hashes when adversarial collisions matter.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
