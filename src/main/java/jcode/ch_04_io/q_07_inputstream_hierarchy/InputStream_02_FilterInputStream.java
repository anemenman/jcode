package jcode.ch_04_io.q_07_inputstream_hierarchy;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.LineNumberInputStream;
import java.io.PushbackInputStream;

public class InputStream_02_FilterInputStream {

  public static void main(String[] args) {

    /**
     * public class PushbackInputStream extends FilterInputStream {
     */
    PushbackInputStream pushbackInputStream;

    /**
     * public class DataInputStream extends FilterInputStream implements DataInput {
     */
    DataInputStream dataInputStream;

    /**
     * public class BufferedInputStream extends FilterInputStream {
     */
    BufferedInputStream bufferedInputStream;

    /**
     * @Deprecated
     * public class LineNumberInputStream extends FilterInputStream {
     */
    LineNumberInputStream lineNumberInputStream;
  }

}
