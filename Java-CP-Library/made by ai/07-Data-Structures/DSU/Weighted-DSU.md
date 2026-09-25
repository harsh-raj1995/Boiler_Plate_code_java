# Weighted DSU

## What is it?

Tracks multiplicative ratio from a node to its parent; useful for equation constraints.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class WeightedDSU {
    int[] p; double[] w; // w[x] = x / parent[x]
    WeightedDSU(int n) { p=new int[n]; w=new double[n]; for(int i=0;i<n;i++){p[i]=i;w[i]=1;} }
    int find(int x) { if(p[x]!=x){ int q=p[x]; int r=find(q); w[x]*=w[q]; p[x]=r; } return p[x]; }
    void union(int a,int b,double ratio) { int ra=find(a), rb=find(b); if(ra!=rb){ p[ra]=rb; w[ra]=ratio*w[b]/w[a]; } } // a/b=ratio
    double ratio(int a,int b) { return find(a)==find(b) ? w[a]/w[b] : -1.0; }
}
```

## Complexity

Amortized O(alpha(n)); floating-point precision is a pitfall.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
