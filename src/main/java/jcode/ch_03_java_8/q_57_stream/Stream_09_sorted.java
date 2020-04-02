package jcode.ch_03_java_8.q_57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_09_sorted {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 22, 5);
    System.out.println(list);

    List<Integer> list2 = list.stream().sorted().collect(Collectors.toList());
    List<Integer> list3 = list.stream().sorted((o1, o2) -> {
      return o2.compareTo(o1);
    }).collect(Collectors.toList());
    System.out.println(list);
    System.out.println(list2);
    System.out.println(list3);
  }

}
