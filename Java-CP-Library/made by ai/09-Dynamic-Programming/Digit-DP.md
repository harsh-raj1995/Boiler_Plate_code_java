# Digit DP

## What is it?

Memoize by position, accumulated state, started flag, and whether prefix remains tight.

## Complete Template

```java
// Paste inside Solution or Main.
static long[][][] memo; static char[] dig;
static long dfs(int pos,int sum,int tight){if(pos==dig.length)return sum; if(tight==0&&memo[pos][sum][0]!=-1)return memo[pos][sum][0];int lim=tight==1?dig[pos]-'0':9;long ans=0;for(int d=0;d<=lim;d++)ans+=dfs(pos+1,sum+d,tight==1&&d==lim?1:0);if(tight==0)memo[pos][sum][0]=ans;return ans;}
```

## Complexity

State count is positions Ã— accumulated values Ã— flags. Reset memo for each bound; use a separate started flag when leading zeros matter.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
