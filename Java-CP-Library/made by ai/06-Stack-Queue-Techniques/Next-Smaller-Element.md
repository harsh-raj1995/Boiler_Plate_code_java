# Next Smaller Element

## What is it?

For each index, find the first strictly smaller value to its right.

## Complete Template

```java
// Paste inside Solution or Main.
static int[] nextSmallerIndex(int[] a){int n=a.length;int[] ans=new int[n];Arrays.fill(ans,-1);ArrayDeque<Integer> st=new ArrayDeque<>();for(int i=n-1;i>=0;i--){while(!st.isEmpty()&&a[st.peek()]>=a[i])st.pop();if(!st.isEmpty())ans[i]=st.peek();st.push(i);}return ans;}
```

## Complexity

O(n) time and O(n) space. Choose >= or > consistently when duplicates exist.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
