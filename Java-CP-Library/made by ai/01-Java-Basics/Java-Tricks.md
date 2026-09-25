# Java Contest API Cheat Sheet

## Arrays, collections, conversion

```java
Arrays.sort(a); Arrays.fill(a, -1); int[] b = Arrays.copyOf(a, n);
int[] mid = Arrays.copyOfRange(a, l, r); // [l,r)
Collections.sort(list); Collections.reverse(list);
int mx = Collections.max(list), mn = Collections.min(list);
int cnt = Collections.frequency(list, x);
int x = Integer.parseInt(s); long y = Long.parseLong(s); String t = String.valueOf(x);
Integer[] boxed = Arrays.stream(a).boxed().toArray(Integer[]::new);
int[] raw = list.stream().mapToInt(Integer::intValue).toArray();
List<int[]> edges = new ArrayList<>();
Map<Integer, List<Integer>> g = new HashMap<>();
g.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
map.merge(key, 1, Integer::sum); int f = map.getOrDefault(key, 0);
```

## Numeric safety and bits

`int` is signed 32-bit; use `long` for sums/products and write `1L << k`. Limits: `Integer.MAX_VALUE`, `Long.MAX_VALUE`. Never compare by subtraction: use `Integer.compare(a,b)`/`Long.compare(a,b)`. Java 17 has `Math.floorDiv`, but not `Math.ceilDiv`; use `-Math.floorDiv(-a, b)` for ceiling division (except the usual `Long.MIN_VALUE / -1` overflow case). For known non-negative `a` and positive `b`, `a / b + (a % b == 0 ? 0 : 1)` avoids addition overflow.

```java
int lo = 0, hi = n - 1; while (lo <= hi) { int mid = lo + (hi - lo) / 2; }
for (int i = 0; i < n; i++) {} for (int v : a) {}
int tmp = a[i]; a[i] = a[j]; a[j] = tmp;
boolean digit = Character.isDigit(c), letter = Character.isLetter(c), alnum = Character.isLetterOrDigit(c);
```

## Coordinate compression

Copy values, sort, deduplicate, then map values to `lowerBound(sorted, value)`. This turns huge ordered coordinates into `0..m-1`; preserve original values if distances are needed.
