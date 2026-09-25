import java.io.*;
import java.util.*;

public class Main {
    static FastScanner fs = new FastScanner(System.in);
    static StringBuilder out = new StringBuilder();
    static void solve() throws Exception {
        // int n = fs.nextInt();
    }
    public static void main(String[] args) throws Exception {
        int t = fs.nextInt(); // replace with 1 for single-test problems
        while (t-- > 0) solve();
        System.out.print(out);
    }
    static class FastScanner {
        private final InputStream in; private final byte[] b = new byte[1 << 16]; private int p, l;
        FastScanner(InputStream in) { this.in = in; }
        int read() throws IOException { if (p >= l) { l = in.read(b); p = 0; if (l < 0) return -1; } return b[p++]; }
        String next() throws IOException { StringBuilder s = new StringBuilder(); int c; do { c = read(); } while (c >= 0 && c <= 32); if (c < 0) return null; while (c > 32) { s.append((char)c); c = read(); } return s.toString(); }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}
