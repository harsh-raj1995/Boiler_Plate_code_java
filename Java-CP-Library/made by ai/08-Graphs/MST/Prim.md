# Prim MST

## What is it?

Grow an MST from one component using a min-heap of crossing edges.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
boolean[] used=new boolean[n];PriorityQueue<State> pq=new PriorityQueue<>(Comparator.comparingLong(State::d));pq.offer(new State(0,0));long total=0;int count=0;
while(!pq.isEmpty()){State x=pq.poll();if(used[x.v()])continue;used[x.v()]=true;total+=x.d();count++;for(Edge e:wg[x.v()])if(!used[e.to()])pq.offer(new State(e.w(),e.to()));}
```

## Complexity

O(m log n). `count<n` means graph is disconnected.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
