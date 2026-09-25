# Z Algorithm

## What is it?

z[i] is longest prefix matching substring starting at i.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static int[] z(String s){int n=s.length(),l=0,r=0;int[] z=new int[n];for(int i=1;i<n;i++){if(i<=r)z[i]=Math.min(r-i+1,z[i-l]);while(i+z[i]<n&&s.charAt(z[i])==s.charAt(i+z[i]))z[i]++;if(i+z[i]-1>r){l=i;r=i+z[i]-1;}}return z;}
```

## Complexity

O(n). Pattern matching uses `pattern + separator + text`.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
