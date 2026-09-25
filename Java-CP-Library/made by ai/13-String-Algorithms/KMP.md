# KMP

## What is it?

Linear pattern matching using a prefix-function (pi).

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static int[] pi(String s){int n=s.length();int[] p=new int[n];for(int i=1;i<n;i++){int j=p[i-1];while(j>0&&s.charAt(i)!=s.charAt(j))j=p[j-1];if(s.charAt(i)==s.charAt(j))j++;p[i]=j;}return p;}
static List<Integer> find(String text,String pat){String z=pat+'#'+text;int[] p=pi(z);List<Integer> ans=new ArrayList<>();for(int i=0;i<p.length;i++)if(p[i]==pat.length())ans.add(i-2*pat.length());return ans;}
```

## Complexity

O(text length + pattern length). Choose a separator not appearing in inputs.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
