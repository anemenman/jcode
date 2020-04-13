package jcode.ch_04_io.q_14_writer_hierarchy;

import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FilterWriter;
import java.io.OutputStreamWriter;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class Writer_01_Hierarchy {

  public static void main(String[] args) {

    /**
     * public abstract class Writer implements Appendable, Closeable, Flushable {
     */
    Writer writer;

    /**
     * public class BufferedWriter extends Writer {
     */
    BufferedWriter bufferedWriter;

    /**
     * public class CharArrayWriter extends Writer {
     */
    CharArrayWriter charArrayWriter;

    /**
     * public class OutputStreamWriter extends Writer {
     */
    OutputStreamWriter outputStreamWriter;

    /**
     * public abstract class FilterWriter extends Writer {
     */
    FilterWriter filterWriter;

    /**
     * public class PipedWriter extends Writer {
     */
    PipedWriter pipedWriter;

    /**
     * public class StringWriter extends Writer {
     */
    StringWriter stringWriter;

    /**
     *
     */
    PrintWriter printWriter;
  }

}
