# Edge List

## What is it?

Store edges directly for Bellman-Ford and Kruskal.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
record Edge(int u, int v, long w) {}
List<Edge> edges = new ArrayList<>(); edges.add(new Edge(u,v,w));
edges.sort(Comparator.comparingLong(Edge::w));
```

## Complexity

Memory O(m); sorting O(m log m).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
