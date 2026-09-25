# Character

## What is it?

Unicode-aware character predicates and case conversion.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
boolean d = Character.isDigit(c), l = Character.isLetter(c), a = Character.isLetterOrDigit(c);
char lower = Character.toLowerCase(c); char upper = Character.toUpperCase(c);
```

## Complexity

Usually O(n) time and O(1) extra space unless the template states otherwise.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
