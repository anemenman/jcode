package jcode.ch_04_io.q_13_reader_hierarchy;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.FilterReader;
import java.io.InputStreamReader;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;

public class Reader_01_Hierarchy {

  public static void main(String[] args) {

    /**
     * public abstract class Reader implements Readable, Closeable {
     */
    Reader reader;

    /**
     * public class BufferedReader extends Reader {
     */
    BufferedReader bufferedReader;

    /**
     * public class CharArrayReader extends Reader {
     */
    CharArrayReader charArrayReader;

    /**
     * public class InputStreamReader extends Reader {
     */
    InputStreamReader inputStreamReader;

    /**
     * public abstract class FilterReader extends Reader {
     */
    FilterReader filterReader;

    /**
     * public class PipedReader extends Reader {
     */
    PipedReader pipedReader;

    /**
     * public class StringReader extends Reader {
     */
    StringReader stringReader;
  }

}
