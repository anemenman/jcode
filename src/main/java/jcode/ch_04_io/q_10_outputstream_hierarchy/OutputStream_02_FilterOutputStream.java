package jcode.ch_04_io.q_10_outputstream_hierarchy;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.PrintStream;

public class OutputStream_02_FilterOutputStream {

  public static void main(String[] args) {

    /**
     * public class DataOutputStream extends FilterOutputStream implements DataOutput {
     */
    DataOutputStream dataOutputStream;

    /**
     * public class BufferedOutputStream extends FilterOutputStream {
     */
    BufferedOutputStream bufferedOutputStream;

    /**
     * public class PrintStream extends FilterOutputStream implements Appendable, Closeable {
     */
    PrintStream printStream;
  }

}
