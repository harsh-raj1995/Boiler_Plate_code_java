# Stack with ArrayDeque

## What is it?

Use `ArrayDeque`, not legacy `Stack`.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
ArrayDeque<Integer> st = new ArrayDeque<>(); st.push(1); int top = st.peek(); int x = st.pop();
boolean empty = st.isEmpty(); int n = st.size(); // null elements are forbidden
```

## Complexity

push/pop/peek O(1).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
