# Palindrome DP

## What is it?

Expand around centers for all palindromic substrings; use DP when a table is needed.

## Complete Template

```java
// Paste inside Solution or Main.
boolean[][] pal=new boolean[n][n];for(int len=1;len<=n;len++)for(int l=0;l+len<=n;l++){int r=l+len-1;pal[l][r]=s.charAt(l)==s.charAt(r)&&(len<=2||pal[l+1][r-1]);}
```

## Complexity

O(nÂ²) time/space. Iterate short intervals before long ones.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
