# Monotonic Queue

## What is it?

A deque of indices maintains the best candidate for every moving window.

## Complete Template

```java
// Paste inside Solution or Main.
static int[] windowMax(int[] a,int k){int[] ans=new int[a.length-k+1];ArrayDeque<Integer> dq=new ArrayDeque<>();for(int i=0;i<a.length;i++){while(!dq.isEmpty()&&dq.peekFirst()<=i-k)dq.pollFirst();while(!dq.isEmpty()&&a[dq.peekLast()]<=a[i])dq.pollLast();dq.addLast(i);if(i>=k-1)ans[i-k+1]=a[dq.peekFirst()];}return ans;}
```

## Complexity

O(n) time and O(k) space. Reverse comparisons for window minimum.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
