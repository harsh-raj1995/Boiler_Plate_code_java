# Prime Factorization and Divisors

## What is it?

Trial divide up to sqrt(remaining n), recording exponents.

## When to use

- Identify the invariant/state before coding.
- Prefer primitive arrays and long for sums, products, costs, and distances.
- Copy the smallest template below and adapt indexing deliberately.

## Complete Template

```java
// Paste inside Solution or Main.
Map<Long,Integer> f=new LinkedHashMap<>(); long x=n;for(long p=2;p*p<=x;p+=(p==2?1:2))while(x%p==0){f.merge(p,1,Integer::sum);x/=p;}if(x>1)f.put(x,1);
List<Long> divs=new ArrayList<>();for(long d=1;d*d<=n;d++)if(n%d==0){divs.add(d);if(d*d!=n)divs.add(n/d);}
```

## Complexity

O(sqrt n) trial division; sort divisors if order matters.

## Common Mistakes

- Mixing inclusive and exclusive endpoints.
- Forgetting empty input or one-element cases.
- Using int where an accumulated answer can overflow.
