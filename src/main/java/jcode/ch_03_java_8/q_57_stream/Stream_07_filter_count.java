package jcode.ch_03_java_8.q_57_stream;

import java.util.Arrays;
import java.util.List;

public class Stream_07_filter_count {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 22, 5);
    System.out.println(list);

    long count = list.stream().filter(x -> x > 5).count();
    System.out.println(count);
  }

}
