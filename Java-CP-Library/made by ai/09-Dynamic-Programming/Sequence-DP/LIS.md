# Longest Increasing Subsequence

## What is it?

Patience sorting keeps minimum possible tail for each subsequence length.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] tail=new int[n];int len=0;for(int x:a){int l=0,r=len;while(l<r){int m=(l+r)>>>1;if(tail[m]<x)l=m+1;else r=m;}tail[l]=x;if(l==len)len++;}
// Replace < with <= for non-decreasing LIS.
```

## Complexity

O(n log n), O(n) space. This returns length; reconstruction needs parent indices.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
