package jcode.ch_04_io.q_10_outputstream_hierarchy;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PipedOutputStream;

public class OutputStream_01_Hierarchy {

  public static void main(String[] args) {

    /**
     * public class FileOutputStream extends OutputStream
     */
    FileOutputStream fileOutputStream;

    /**
     * public class PipedOutputStream extends OutputStream {
     */
    PipedOutputStream pipedOutputStream;

    /**
     * public class FilterOutputStream extends OutputStream {
     */
    FilterOutputStream filterOutputStream;

    /**
     * public class ByteArrayOutputStream extends OutputStream {
     */
    ByteArrayOutputStream byteArrayOutputStream;
  }

}
