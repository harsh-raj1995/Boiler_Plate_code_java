import java.io.*;
import java.util.*;

/** Fast byte reader. next() returns null at EOF. */
class FastScanner {
    private final InputStream in;
    private final byte[] buffer = new byte[1 << 16];
    private int ptr = 0, len = 0;
    FastScanner(InputStream in) { this.in = in; }
    private int read() throws IOException {
        if (ptr >= len) { len = in.read(buffer); ptr = 0; if (len <= 0) return -1; }
        return buffer[ptr++];
    }
    String next() throws IOException {
        StringBuilder sb = new StringBuilder(); int c;
        do { c = read(); } while (c <= ' ' && c != -1);
        if (c == -1) return null;
        while (c > ' ') { sb.append((char)c); c = read(); }
        return sb.toString();
    }
    int nextInt() throws IOException { return Integer.parseInt(next()); }
    long nextLong() throws IOException { return Long.parseLong(next()); }
    double nextDouble() throws IOException { return Double.parseDouble(next()); }
}
