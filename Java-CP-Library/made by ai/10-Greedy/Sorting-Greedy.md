# Sorting Greedy

## What is it?

Sort by the field that exposes an exchange argument, then make locally forced choices.

## Complete Template

```java
// Paste inside Solution or Main.
Arrays.sort(a);long answer=0;for(int i=0;i<a.length;i++){/* prove this sorted-order choice cannot hurt */answer+=a[i];}
```

## Complexity

Usually O(n log n). A greedy solution needs a proof, not just passing samples.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
