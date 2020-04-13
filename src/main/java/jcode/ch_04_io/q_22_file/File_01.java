package jcode.ch_04_io.q_22_file;

import java.io.File;

public class File_01 {

  public static void main(String[] args) {
    /**
     * public class File implements Serializable, Comparable<File> {
     */
    File file = new File("path to dir");
    file.list(); // dir list
    file.isDirectory(); // is dir
    file.isFile();
  }

}
