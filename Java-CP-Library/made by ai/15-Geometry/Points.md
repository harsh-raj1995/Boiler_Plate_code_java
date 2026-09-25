# Points

## What is it?

Use an immutable point record and long coordinates for integral geometry.

## Complete Template

```java
// Paste inside Solution or Main.
record Point(long x,long y) {}
static Point add(Point a,Point b){return new Point(a.x()+b.x(),a.y()+b.y());}
static Point sub(Point a,Point b){return new Point(a.x()-b.x(),a.y()-b.y());}
```

## Complexity

O(1) per operation. Coordinate differences/products may overflow long near 1e9+ scales.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
