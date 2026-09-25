# Distance

## What is it?

Compare squared distances to avoid floating point and square roots.

## Complete Template

```java
// Paste inside Solution or Main.
static long dist2(long x1,long y1,long x2,long y2){long dx=x1-x2,dy=y1-y2;return dx*dx+dy*dy;}
static double distance(long x1,long y1,long x2,long y2){return Math.hypot(x1-x2,y1-y2);}
```

## Complexity

O(1). Use squared distance for ordering; it can overflow long for very large coordinates.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
