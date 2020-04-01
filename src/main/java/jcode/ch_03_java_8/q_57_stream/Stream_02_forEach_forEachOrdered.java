package jcode.ch_03_java_8.q_57_stream;

import java.util.ArrayList;
import java.util.List;

public class Stream_02_forEach_forEachOrdered {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    System.out.println("forEach--->");
    list.forEach(System.out::println);
    System.out.println("forEachOrdered--->");
    list.stream().forEachOrdered(System.out::println);
  }

}
