# Bellman Ford

## What is it?

Handles negative weights and detects reachable negative cycles.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long INF=Long.MAX_VALUE/4; long[] d=new long[n];Arrays.fill(d,INF);d[s]=0;
for(int i=1;i<n;i++){boolean changed=false;for(Edge e:edges)if(d[e.u()]<INF&&d[e.v()]>d[e.u()]+e.w()){d[e.v()]=d[e.u()]+e.w();changed=true;}if(!changed)break;}
boolean neg=false; for(Edge e:edges) if(d[e.u()]<INF&&d[e.v()]>d[e.u()]+e.w()) neg=true;
```

## Complexity

O(nm). For undirected edges, add both directions.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
