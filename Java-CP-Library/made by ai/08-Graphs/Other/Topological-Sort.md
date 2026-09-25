# Topological Sort

## What is it?

Orders a DAG so every directed edge points from an earlier to a later vertex. Kahn also detects cycles.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] indeg=new int[n];for(int u=0;u<n;u++)for(int v:g[u])indeg[v]++;ArrayDeque<Integer> q=new ArrayDeque<>();for(int i=0;i<n;i++)if(indeg[i]==0)q.offer(i);List<Integer> order=new ArrayList<>();
while(!q.isEmpty()){int u=q.poll();order.add(u);for(int v:g[u])if(--indeg[v]==0)q.offer(v);} boolean dag=order.size()==n;
// DFS version: append u after visiting neighbors, then reverse; use 3 colors to reject cycles.
```

## Complexity

O(n+m). An ordering exists iff the graph is acyclic.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
