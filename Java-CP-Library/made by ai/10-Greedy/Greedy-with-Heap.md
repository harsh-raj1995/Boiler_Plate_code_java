# Greedy with Heap

## What is it?

Keep currently selected candidates in a heap and discard the least useful one when a constraint breaks.

## Complete Template

```java
// Paste inside Solution or Main.
Arrays.sort(jobs,(a,b)->Integer.compare(a[0],b[0]));PriorityQueue<Integer> chosen=new PriorityQueue<>();long sum=0;for(int[] job:jobs){sum+=job[1];chosen.offer(job[1]);if(sum>job[0])sum-=chosen.poll();}
```

## Complexity

O(n log n). This common deadline pattern assumes positive durations.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
