# Type Conversion

## What is it?

Explicit conversion prevents accidental truncation.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
long sum = (long) a * b; int x = (int) value; // only after range check
int n = Integer.parseInt(s); String text = String.valueOf(n);
double d = (double) numerator / denominator;
```

## Complexity

Usually O(n) time and O(1) extra space unless the template states otherwise.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
