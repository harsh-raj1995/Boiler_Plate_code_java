# LCA with Binary Lifting

## What is it?

Precompute 2^j ancestors in a rooted tree, then raise nodes by bits.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int LOG=32-Integer.numberOfLeadingZeros(n);int[][] up=new int[LOG][n];int[] depth=new int[n];
// DFS/BFS fills up[0][child]=parent and depth; then up[j][v]=up[j-1][up[j-1][v]].
int lift(int v,int k){for(int j=0;j<LOG;j++)if((k&(1<<j))!=0)v=up[j][v];return v;}
```

## Complexity

Preprocess O(n log n), LCA O(log n). Root parent should point to itself.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
