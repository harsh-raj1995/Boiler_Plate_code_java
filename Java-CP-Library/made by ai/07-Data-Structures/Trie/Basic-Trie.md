# Basic Trie

## What is it?

Lowercase-English prefix tree with exact search, prefix search, and prefix count.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class Trie { static class Node { Node[] next=new Node[26]; int pass, end; } Node root=new Node();
    void insert(String s){Node cur=root;cur.pass++;for(char c:s.toCharArray()){int i=c-'a';if(cur.next[i]==null)cur.next[i]=new Node();cur=cur.next[i];cur.pass++;}cur.end++;}
    Node walk(String s){Node cur=root;for(char c:s.toCharArray()){cur=cur.next[c-'a'];if(cur==null)return null;}return cur;}
    boolean search(String s){Node x=walk(s);return x!=null&&x.end>0;}
    boolean startsWith(String p){return walk(p)!=null;}
    int prefixCount(String p){Node x=walk(p);return x==null?0:x.pass;}
}
```

## Complexity

O(length) per operation; memory O(total inserted characters Ã— alphabet).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
