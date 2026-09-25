# Manacher

## What is it?

Computes palindrome radii around odd/even centers in linear time.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static int[] odd(String s){int n=s.length(),l=0,r=-1;int[] d=new int[n];for(int i=0;i<n;i++){int k=i>r?1:Math.min(d[l+r-i],r-i+1);while(i-k>=0&&i+k<n&&s.charAt(i-k)==s.charAt(i+k))k++;d[i]=k--;if(i+k>r){l=i-k;r=i+k;}}return d;}
// Even radii is analogous; use transformed-string form if you prefer one implementation.
```

## Complexity

O(n); odd radius d[i] includes the center.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
