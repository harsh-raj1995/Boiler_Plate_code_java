# GCD, LCM, Extended GCD

## What is it?

Euclid computes gcd; extended gcd also finds ax+by=g.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
static long gcd(long a,long b){while(b!=0){long t=a%b;a=b;b=t;}return Math.abs(a);}
static long lcm(long a,long b){return a/gcd(a,b)*b;}
static long[] egcd(long a,long b){if(b==0)return new long[]{a,1,0};long[] z=egcd(b,a%b);return new long[]{z[0],z[2],z[1]-(a/b)*z[2]};}
```

## Complexity

O(log min(a,b)); lcm multiplication can overflow.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
