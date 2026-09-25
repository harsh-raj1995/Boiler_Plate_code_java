import java.io.*;
class FastOutput {
    private final StringBuilder sb = new StringBuilder(); private final PrintWriter out;
    FastOutput(OutputStream os) { out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(os))); }
    FastOutput print(Object x) { sb.append(x); return this; }
    FastOutput println(Object x) { sb.append(x).append('\n'); return this; }
    void flush() { out.print(sb); out.flush(); sb.setLength(0); }
}
