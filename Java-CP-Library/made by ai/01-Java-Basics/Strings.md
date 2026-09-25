# Strings

## What is it?

Immutable character sequences; create a StringBuilder for repeated edits.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
String s = "abc";
char c = s.charAt(0); int n = s.length();
String sub = s.substring(1, 3); // [1,3)
boolean ok = s.startsWith("a") || s.equals("abc");
char[] ch = s.toCharArray(); Arrays.sort(ch); String sorted = new String(ch);
```

## Complexity

Most indexed operations are O(1); substring/copies and concatenation need care.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
