# Cross Product

## What is it?

The signed cross product measures turn direction and twice triangle area.

## Complete Template

```java
// Paste inside Solution or Main.
static long cross(long ax,long ay,long bx,long by){return ax*by-ay*bx;}
static long cross(Point a,Point b,Point c){return cross(b.x()-a.x(),b.y()-a.y(),c.x()-a.x(),c.y()-a.y());}
```

## Complexity

O(1). Positive means counter-clockwise in standard x-right/y-up coordinates.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
