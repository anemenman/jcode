package jcode.ch_04_io.q_22_file;

import java.io.File;
import java.io.FileFilter;

public class File_03_FileFilter {

  public static void main(String[] args) {
    /**
     * @FunctionalInterface
     * public interface FileFilter {
     * boolean accept(File pathname);
     * }
     */
    FileFilter fileFilter = File::exists;
    System.out.println(fileFilter.accept(new File("abc")));
    System.out.println(fileFilter.accept(new File("/")));
  }

}
