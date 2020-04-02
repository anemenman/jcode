package jcode.ch_03_java_8.q_57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_06_filter {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 22, 5);
    System.out.println(list);

    List<Integer> list2 = list.stream().filter(x -> x > 5).collect(Collectors.toList());
    System.out.println(list2);
  }

}
