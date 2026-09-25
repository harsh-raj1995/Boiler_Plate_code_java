# Dijkstra

## What is it?

Single-source shortest paths with nonnegative edge weights only.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
record State(long d,int v) {}
long[] d=new long[n]; Arrays.fill(d,Long.MAX_VALUE/4); d[s]=0;
PriorityQueue<State> pq=new PriorityQueue<>(Comparator.comparingLong(State::d)); pq.offer(new State(0,s));
while(!pq.isEmpty()){State cur=pq.poll();if(cur.d()!=d[cur.v()])continue;for(Edge e:wg[cur.v()])if(d[e.to()]>cur.d()+e.w()){d[e.to()]=cur.d()+e.w();pq.offer(new State(d[e.to()],e.to()));}}
```

## Complexity

O((n+m) log n). Do not use with negative edges; use long distances.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
