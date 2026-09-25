# Disjoint Set Union (DSU)

## What is it?

Maintains connected components under edge additions. Use for Kruskal and dynamic connectivity.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class DSU {
    int[] p, size; int components;
    DSU(int n) { p = new int[n]; size = new int[n]; components = n; for (int i=0;i<n;i++) { p[i]=i; size[i]=1; } }
    int find(int x) { return p[x] == x ? x : (p[x] = find(p[x])); }
    boolean union(int a, int b) { a=find(a); b=find(b); if(a==b) return false; if(size[a]<size[b]) { int t=a;a=b;b=t; } p[b]=a; size[a]+=size[b]; components--; return true; }
    boolean connected(int a,int b) { return find(a)==find(b); }
    int size(int x) { return size[find(x)]; }
}
```

## Complexity

Amortized O(alpha(n)) per operation; O(n) space.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
