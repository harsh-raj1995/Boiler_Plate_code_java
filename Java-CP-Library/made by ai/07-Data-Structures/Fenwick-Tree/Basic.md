# Fenwick Tree

## What is it?

Compact point-update, prefix/range-sum structure. Internally 1-indexed.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class Fenwick {
    int n; long[] bit;
    Fenwick(int n) { this.n=n; bit=new long[n+1]; }
    void add(int idx, long delta) { for(idx++;idx<=n;idx+=idx&-idx) bit[idx]+=delta; }
    long sumPrefix(int idx) { long s=0; for(idx++;idx>0;idx-=idx&-idx) s+=bit[idx]; return s; }
    long sum(int l,int r) { return l>r ? 0 : sumPrefix(r)-(l==0?0:sumPrefix(l-1)); }
}
```

## Complexity

add/prefix/range sum O(log n), space O(n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
