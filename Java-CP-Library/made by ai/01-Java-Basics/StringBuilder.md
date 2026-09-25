# StringBuilder

## What is it?

Mutable strings for output and incremental construction.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
StringBuilder sb = new StringBuilder();
sb.append(x).append(' '); sb.setCharAt(0, 'A');
sb.reverse(); String answer = sb.toString();
```

## Complexity

Amortized O(1) append; reverse O(n).

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
