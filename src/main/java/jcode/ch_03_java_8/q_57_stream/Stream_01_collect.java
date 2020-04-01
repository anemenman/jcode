package jcode.ch_03_java_8.q_57_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_01_collect {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("c");
    list.add("a");

    System.out.println(list);

    Set<String> set = list.stream().collect(Collectors.toSet());

    System.out.println(set);
  }

}
