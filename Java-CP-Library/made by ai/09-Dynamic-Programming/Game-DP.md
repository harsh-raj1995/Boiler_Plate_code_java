# Game DP

## What is it?

Winning state if any legal move reaches a losing state.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
boolean[] win=new boolean[N+1];for(int x=1;x<=N;x++)for(int move:moves)if(move<=x&&!win[x-move]){win[x]=true;break;}
```

## Complexity

O(N Ã— moves). Clarify normal-play vs misere terminal rule.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
