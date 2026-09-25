# Orientation

## What is it?

Classify three points by cross-product sign.

## Complete Template

```java
// Paste inside Solution or Main.
static int orientation(Point a,Point b,Point c){long z=cross(a,b,c);return Long.compare(z,0);}// +1 CCW, -1 CW, 0 collinear
static boolean onSegment(Point a,Point b,Point p){return orientation(a,b,p)==0&&Math.min(a.x(),b.x())<=p.x()&&p.x()<=Math.max(a.x(),b.x())&&Math.min(a.y(),b.y())<=p.y()&&p.y()<=Math.max(a.y(),b.y());}
```

## Complexity

O(1). Screen coordinates often have y increasing downward, reversing visual turn direction.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
