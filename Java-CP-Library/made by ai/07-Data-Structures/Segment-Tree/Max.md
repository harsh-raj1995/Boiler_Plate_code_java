# Segment Tree Maximum

## What is it?

Point update and inclusive range maximum.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class SegTree { int n; long[] t;
    SegTree(long[] a){n=a.length;t=new long[4*n];build(1,0,n-1,a);}
    void build(int v,int l,int r,long[] a){if(l==r){t[v]=a[l];return;}int m=(l+r)>>>1;build(v<<1,l,m,a);build(v<<1|1,m+1,r,a);t[v]=Math.max(t[v<<1],t[v<<1|1]);}
    void set(int i,long x){set(1,0,n-1,i,x);}void set(int v,int l,int r,int i,long x){if(l==r){t[v]=x;return;}int m=(l+r)>>>1;if(i<=m)set(v<<1,l,m,i,x);else set(v<<1|1,m+1,r,i,x);t[v]=Math.max(t[v<<1],t[v<<1|1]);}
    long query(int l,int r){return query(1,0,n-1,l,r);} long query(int v,int l,int r,int ql,int qr){if(ql<=l&&r<=qr)return t[v];int m=(l+r)>>>1;if(qr<=m)return query(v<<1,l,m,ql,qr);if(ql>m)return query(v<<1|1,m+1,r,ql,qr);return Math.max(query(v<<1,l,m,ql,qr),query(v<<1|1,m+1,r,ql,qr));}
}
```

## Complexity

Build O(n); query/update O(log n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
