package jcode.ch_04_io.q_07_inputstream_hierarchy;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.io.StringBufferInputStream;

public class InputStream_01_Hierarchy {

  public static void main(String[] args) {

    InputStream inputStream;

    /**
     * @Deprecated
     * public class StringBufferInputStream extends InputStream {
     */
    StringBufferInputStream stringBufferInputStream;

    /**
     * public class SequenceInputStream extends InputStream {
     */
    SequenceInputStream sequenceInputStream;

    /**
     * public class PipedInputStream extends InputStream {
     */
    PipedInputStream pipedInputStream;

    /**
     * public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
     */
    ObjectInputStream objectInputStream;

    /**
     * public class FilterInputStream extends InputStream {
     */
    FilterInputStream filterInputStream;

    /**
     * public class FileInputStream extends InputStream {
     */
    FileInputStream fileInputStream;

    /**
     * public class ByteArrayInputStream extends InputStream {
     */
    ByteArrayInputStream byteArrayInputStream;
  }

}
