package jcode.ch_03_java_8.q_57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_08_limit {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 22, 5);
    System.out.println(list);

    List<Integer> list2 = list.stream().limit(2).collect(Collectors.toList());
    System.out.println(list);
    System.out.println(list2);
  }

}
