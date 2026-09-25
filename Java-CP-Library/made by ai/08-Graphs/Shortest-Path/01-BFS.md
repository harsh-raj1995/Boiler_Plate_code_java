# 0-1 BFS

## What is it?

Shortest paths when every edge has weight exactly 0 or 1.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long[] d=new long[n];Arrays.fill(d,Long.MAX_VALUE/4);ArrayDeque<Integer> q=new ArrayDeque<>();d[s]=0;q.add(s);
while(!q.isEmpty()){int u=q.pollFirst();for(Edge e:wg[u])if(d[e.to()]>d[u]+e.w()){d[e.to()]=d[u]+e.w();if(e.w()==0)q.addFirst(e.to());else q.addLast(e.to());}}
```

## Complexity

O(n+m). Only weights 0/1 are valid.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
