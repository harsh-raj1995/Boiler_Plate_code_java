# Bipartite Graph

## What is it?

Two-color every component; an edge joining same colors is a conflict.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] color=new int[n];Arrays.fill(color,-1);boolean ok=true;for(int s=0;s<n;s++)if(color[s]<0){ArrayDeque<Integer> q=new ArrayDeque<>();q.add(s);color[s]=0;while(!q.isEmpty()){int u=q.poll();for(int v:g[u])if(color[v]<0){color[v]=color[u]^1;q.add(v);}else if(color[v]==color[u])ok=false;}}
```

## Complexity

O(n+m). A self-loop immediately makes it non-bipartite.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
