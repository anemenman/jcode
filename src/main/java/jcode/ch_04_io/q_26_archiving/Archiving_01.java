package jcode.ch_04_io.q_26_archiving;

import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class Archiving_01 {

  public static void main(String[] args) {

    /**
     * public class DeflaterOutputStream extends FilterOutputStream {
     */
    DeflaterOutputStream deflaterOutputStream;

    /**
     * public class InflaterInputStream extends FilterInputStream {
     */
    InflaterInputStream inflaterInputStream;

    /**
     * public class ZipInputStream extends InflaterInputStream implements ZipConstants {
     */
    ZipInputStream zipInputStream;

    /**
     * public class ZipOutputStream extends DeflaterOutputStream implements ZipConstants {
     */
    ZipOutputStream zipOutputStream;

    /**
     * public class GZIPInputStream extends InflaterInputStream {
     */
    GZIPInputStream gzipInputStream;

    /**
     * public class GZIPOutputStream extends DeflaterOutputStream {
     */
    GZIPOutputStream gzipOutputStream;
  }

}
