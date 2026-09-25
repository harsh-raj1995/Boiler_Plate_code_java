import java.util.*;

class Solution {
    // Arrays: two pointers, prefix sums, binary search.
    // Strings: StringBuilder, frequency arrays, KMP.
    // Graph: List<Integer>[] g; DFS/BFS with ArrayDeque<Integer>.
    // DP: define state, base case, transition, order.
    // Heap: PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
    // Stack/deque: ArrayDeque<Integer> dq = new ArrayDeque<>();
    // Math: use long for products/sums.
    static int lowerBound(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) { int m = (l + r) >>> 1; if (a[m] < x) l = m + 1; else r = m; }
        return l;
    }
    static long gcd(long a, long b) { while (b != 0) { long t = a % b; a = b; b = t; } return Math.abs(a); }
}
