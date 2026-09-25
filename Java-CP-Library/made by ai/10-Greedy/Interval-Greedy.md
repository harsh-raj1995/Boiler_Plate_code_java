# Interval Greedy

## What is it?

For maximum number of non-overlapping intervals, select by earliest finishing time.

## Complete Template

```java
// Paste inside Solution or Main.
Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));int count=0,end=Integer.MIN_VALUE;for(int[] in:intervals)if(in[0]>=end){count++;end=in[1];}
```

## Complexity

O(n log n). If touching intervals conflict, use in[0] > end instead.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
