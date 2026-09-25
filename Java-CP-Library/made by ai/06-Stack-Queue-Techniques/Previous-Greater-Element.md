# Previous Greater Element

## What is it?

For each index, find the closest strictly larger value on the left.

## Complete Template

```java
// Paste inside Solution or Main.
static int[] previousGreaterIndex(int[] a){int[] ans=new int[a.length];Arrays.fill(ans,-1);ArrayDeque<Integer> st=new ArrayDeque<>();for(int i=0;i<a.length;i++){while(!st.isEmpty()&&a[st.peek()]<=a[i])st.pop();if(!st.isEmpty())ans[i]=st.peek();st.push(i);}return ans;}
```

## Complexity

O(n) time and O(n) space.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
