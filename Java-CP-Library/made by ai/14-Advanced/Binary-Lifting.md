# Binary Lifting

## What is it?

Precompute jump pointers to move a node k ancestors in logarithmic time.

## Complete Template

```java
// Paste inside Solution or Main.
static int kthAncestor(int v,int k,int[][] up){for(int j=0;j<up.length;j++)if((k&(1<<j))!=0)v=up[j][v];return v;}
// Build: up[0][root]=root; up[0][child]=parent; up[j][v]=up[j-1][up[j-1][v]].
```

## Complexity

Build O(n log n), jump query O(log n). LOG must cover the largest depth.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
