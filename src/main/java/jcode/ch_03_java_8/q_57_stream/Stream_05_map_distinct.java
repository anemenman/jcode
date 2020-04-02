package jcode.ch_03_java_8.q_57_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_05_map_distinct {

  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 22, 5);
    List<Integer> list2 = list.stream().map(x -> x * x).distinct().collect(Collectors.toList());

    System.out.println(list2);
  }

}
