package jcode.ch_04_io.q_04_io_stream_hierarchy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IO_01_hierarchy {

  public static void main(String[] args) {

    /**
     * public abstract class InputStream implements Closeable {
     */
    InputStream inputStream;

    /**
     * public abstract class OutputStream implements Closeable, Flushable {
     */
    OutputStream outputStream;

    /**
     * public abstract class Reader implements Readable, Closeable {
     */
    Reader reader;

    /**
     * public abstract class Writer implements Appendable, Closeable, Flushable {
     */
    Writer writer;

  }

}
