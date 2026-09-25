# State Machine / Stock DP

## What is it?

Keep a state for each allowed mode; transitions represent legal actions.

## Complete Template

```java
// Paste inside Solution or Main.
long hold=Long.MIN_VALUE/4,cash=0;for(int price:prices){long oldHold=hold;hold=Math.max(hold,cash-price);cash=Math.max(cash,oldHold+price);} // unlimited transactions, one share
```

## Complexity

O(n) time, O(1) space. Save old state values before simultaneous transitions.

## Contest Notes

Keep endpoints and sentinels explicit; use iterative traversal if recursion depth can be linear.
