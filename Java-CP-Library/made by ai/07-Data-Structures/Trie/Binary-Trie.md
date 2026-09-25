# Binary Trie

## What is it?

Stores nonnegative ints and answers maximum/minimum XOR. Choose bit 30 for int values; use 62 for nonnegative longs.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static class BinaryTrie { static class Node { Node[] ch=new Node[2]; int cnt; } Node root=new Node();
    void insert(int x){Node c=root;c.cnt++;for(int b=30;b>=0;b--){int z=(x>>>b)&1;if(c.ch[z]==null)c.ch[z]=new Node();c=c.ch[z];c.cnt++;}}
    int xor(int x,boolean max){Node c=root;int ans=0;for(int b=30;b>=0;b--){int z=(x>>>b)&1,want=max?z^1:z;if(c.ch[want]!=null&&c.ch[want].cnt>0){if(max)ans|=1<<b;c=c.ch[want];}else{if(!max)ans|=1<<b;c=c.ch[want^1];}}return ans;}
    int maximumXor(int x){return xor(x,true);} int minimumXor(int x){return xor(x,false);}
}
```

## Complexity

insert/query O(31); query requires at least one inserted value.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
