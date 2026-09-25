# Grid BFS / DFS

## What is it?

Traverse 4-neighbor grids; check bounds before indexing.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
int[] dr={-1,1,0,0}, dc={0,0,-1,1}; ArrayDeque<int[]> q=new ArrayDeque<>(); q.offer(new int[]{sr,sc}); seen[sr][sc]=true;
while(!q.isEmpty()){int[] p=q.poll();for(int k=0;k<4;k++){int r=p[0]+dr[k],c=p[1]+dc[k];if(0<=r&&r<R&&0<=c&&c<C&&!seen[r][c]&&grid[r][c]!='#'){seen[r][c]=true;q.offer(new int[]{r,c});}}}
```

## Complexity

O(rowsÃ—cols). Mark when enqueuing, not when dequeuing.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
