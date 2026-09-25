# Lazy Segment Tree: Range Add / Range Sum

## What is it?

Defers range updates using a lazy tag.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class LazySeg {
    int n; long[] sum, lazy;
    LazySeg(int n){this.n=n;sum=new long[4*n];lazy=new long[4*n];}
    void apply(int v,int l,int r,long x){sum[v]+=x*(r-l+1);lazy[v]+=x;}
    void push(int v,int l,int r){if(l==r||lazy[v]==0)return;int m=(l+r)>>>1;apply(v<<1,l,m,lazy[v]);apply(v<<1|1,m+1,r,lazy[v]);lazy[v]=0;}
    void add(int ql,int qr,long x){add(1,0,n-1,ql,qr,x);}
    void add(int v,int l,int r,int ql,int qr,long x){if(ql<=l&&r<=qr){apply(v,l,r,x);return;}push(v,l,r);int m=(l+r)>>>1;if(ql<=m)add(v<<1,l,m,ql,qr,x);if(qr>m)add(v<<1|1,m+1,r,ql,qr,x);sum[v]=sum[v<<1]+sum[v<<1|1];}
    long query(int ql,int qr){return query(1,0,n-1,ql,qr);}
    long query(int v,int l,int r,int ql,int qr){if(ql<=l&&r<=qr)return sum[v];push(v,l,r);int m=(l+r)>>>1;long z=0;if(ql<=m)z+=query(v<<1,l,m,ql,qr);if(qr>m)z+=query(v<<1|1,m+1,r,ql,qr);return z;}
}
```

## Complexity

Range add/query O(log n); values can overflow `long` if update Ã— length is huge.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
