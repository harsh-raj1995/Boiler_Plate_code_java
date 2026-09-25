# Java Competitive Programming Library

## Purpose

Personal Java 17+ competitive-programming reference: compact algorithms, data structures, APIs, and starter programs intended to be copied during LeetCode, Codeforces, and CodeChef contests.

## How to use

During a contest, search this library for the required data structure or pattern, copy the smallest relevant template, then adapt its input format and indexing. Snippets use 0-based arrays unless stated otherwise.

## Topic Map

- [ðŸ”¥ Template](00-Template/) â€” scanner, output, standalone main.
- [ðŸ”¥ Java basics](01-Java-Basics/), [collections](02-Collections/), [sorting](03-Comparators-Sorting/), [search](04-Searching/), [array patterns](05-Array-Techniques/).
- [ðŸ”¥ Stack/queue patterns](06-Stack-Queue-Techniques/), [data structures](07-Data-Structures/), [graphs](08-Graphs/), [DP](09-Dynamic-Programming/).
- [ðŸŸ¡ Greedy](10-Greedy/), [bits](11-Bit-Manipulation/), [mathematics](12-Mathematics/), [strings](13-String-Algorithms/).
- [ðŸ”´ Advanced](14-Advanced/), [geometry](15-Geometry/), [contest templates](99-Contest-Templates/).

## Priority

ðŸ”¥ Must Know: arrays, maps/sets, binary search, prefix sums, BFS/DFS, DSU, Dijkstra, 0/1 knapsack, greedy, GCD, bits.  
ðŸŸ¡ Important: Fenwick, segment tree, trie, KMP, rolling hash, LCA, SCC.  
ðŸ”´ Advanced: HLD, rerooting, digit DP, lazy trees, Manacher.

## Contest Workflow

1. Read the problem.
2. Identify the pattern and constraints.
3. Open the relevant template.
4. Copy the minimal implementation.
5. Adapt it.
6. Test edge cases: empty/singleton, duplicates, overflow, and boundaries.

Every snippet favors `ArrayDeque`, safe comparisons, and `long` where it matters. Recursive graph/tree solutions can overflow Java's call stack on deep inputs; use iterative traversal when constraints are large.
