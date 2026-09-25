# Permutations nPr

## What is it?

nPr = n!/(n-r)! under a modulus.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long nPr(int n,int r){return r<0||r>n?0:fact[n]*invFact[n-r]%MOD;}
static boolean nextPermutation(int[] a){int i=a.length-2;while(i>=0&&a[i]>=a[i+1])i--;if(i<0)return false;int j=a.length-1;while(a[j]<=a[i])j--;int t=a[i];a[i]=a[j];a[j]=t;for(int l=i+1,r=a.length-1;l<r;l++,r--){t=a[l];a[l]=a[r];a[r]=t;}return true;}
```

## Complexity

O(1) per precomputed nPr.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
