package jcode.ch_04_io.q_20_osis_to_writer_reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IS_to_Reader_01 {

  public static void main(String[] args) throws IOException {
    InputStream inputStream = new FileInputStream("path to file");
    Reader reader = new InputStreamReader(inputStream);
    /**
     * ...
     */
    int data = reader.read();
    while (data != -1) {
      char c = (char) data;
      data = reader.read();
    }
    reader.close();
  }

}
