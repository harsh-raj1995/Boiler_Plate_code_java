import java.io.*;
import java.util.*;

/** Self-contained single-test-case starter. */
public class General {
    static final FastScanner fs = new FastScanner(System.in);
    static final StringBuilder out = new StringBuilder();
    static void solve() throws Exception {
        // int n = fs.nextInt();
    }
    public static void main(String[] args) throws Exception { solve(); System.out.print(out); }
    static class FastScanner {
        private final InputStream in; private final byte[] buffer = new byte[1 << 16]; private int ptr, len;
        FastScanner(InputStream in) { this.in = in; }
        private int read() throws IOException { if (ptr >= len) { len = in.read(buffer); ptr = 0; } return len <= 0 ? -1 : buffer[ptr++]; }
        String next() throws IOException { StringBuilder s = new StringBuilder(); int c; do { c = read(); } while (c >= 0 && c <= ' '); if (c < 0) return null; while (c > ' ') { s.append((char) c); c = read(); } return s.toString(); }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}
