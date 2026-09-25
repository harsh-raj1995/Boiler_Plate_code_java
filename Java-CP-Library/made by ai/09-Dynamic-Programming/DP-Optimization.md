# DP Optimization

## What is it?

Optimize only after writing the correct recurrence and proving its dependency shape.

## Complete Template

```java
// Paste inside Solution or Main.
// Monotonic-queue optimization for dp[i]=value[i]+min(dp[j]) over j in [i-k,i-1]
ArrayDeque<Integer> dq=new ArrayDeque<>();for(int i=0;i<n;i++){while(!dq.isEmpty()&&dq.peekFirst()<i-k)dq.pollFirst();dp[i]=value[i]+dp[dq.peekFirst()];while(!dq.isEmpty()&&dp[dq.peekLast()]>=dp[i])dq.pollLast();dq.addLast(i);}
```

## Complexity

Often O(n) instead of O(nk). Other tools: divide-and-conquer DP, convex hull trick, bitset DP; each needs its own proof.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
