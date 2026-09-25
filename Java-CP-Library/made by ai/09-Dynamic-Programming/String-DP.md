# String DP

## What is it?

Edit distance: dp[i][j] is minimum edits between first i and first j characters.

## Complete Template

```java
// Paste inside Solution or Main.
int[][] dp=new int[a.length()+1][b.length()+1];for(int i=0;i<=a.length();i++)dp[i][0]=i;for(int j=0;j<=b.length();j++)dp[0][j]=j;for(int i=1;i<=a.length();i++)for(int j=1;j<=b.length();j++)dp[i][j]=a.charAt(i-1)==b.charAt(j-1)?dp[i-1][j-1]:1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
```

## Complexity

O(nm) time/space. State boundaries represent empty prefixes.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
