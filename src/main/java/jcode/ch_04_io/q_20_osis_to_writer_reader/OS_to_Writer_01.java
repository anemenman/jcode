package jcode.ch_04_io.q_20_osis_to_writer_reader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OS_to_Writer_01 {

  public static void main(String[] args) throws IOException {
    OutputStream outputStream = new FileOutputStream("path to file");
    Writer writer = new OutputStreamWriter(outputStream);
    /**
     * ...
     */
    writer.close();
  }

}
