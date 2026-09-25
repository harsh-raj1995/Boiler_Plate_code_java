# BFS

## What is it?

Shortest path in an unweighted graph (fewest edges) and level traversal.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] dist=new int[n]; Arrays.fill(dist,-1); ArrayDeque<Integer> q=new ArrayDeque<>(); dist[s]=0;q.offer(s);
while(!q.isEmpty()){int u=q.poll();for(int v:g[u])if(dist[v]<0){dist[v]=dist[u]+1;q.offer(v);}}
```

## Complexity

O(n+m); `dist==-1` is also visited state.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
