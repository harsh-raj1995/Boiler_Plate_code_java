# Monotonic Stack

## What is it?

Stores indices in sorted value order, so each index is pushed and popped once.

## Complete Template

```java
// Paste inside Solution or Main.
static int[] nextGreater(int[] a){int n=a.length;int[] ans=new int[n];Arrays.fill(ans,-1);ArrayDeque<Integer> st=new ArrayDeque<>();for(int i=0;i<n;i++){while(!st.isEmpty()&&a[st.peek()]<a[i])ans[st.pop()]=i;st.push(i);}return ans;}
```

## Complexity

O(n) time and O(n) space. Change < to <= according to duplicate ownership.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
