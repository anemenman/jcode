package jcode.ch_03_java_8.q_57_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_04_map {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");

    System.out.println(list);

    List<Integer> integers = list.stream().map(String::hashCode).collect(Collectors.toList());

    System.out.println(integers);
  }

}
