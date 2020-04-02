package jcode.ch_03_java_8.q_57_stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Stream_11_summaryStatistics {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 1, 22, 5);
    System.out.println(list);
    IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt((x) -> x)
        .summaryStatistics();

    System.out.println("getMax---> " + intSummaryStatistics.getMax());
    System.out.println("getMin---> " + intSummaryStatistics.getMin());
    System.out.println("getSum---> " + intSummaryStatistics.getSum());
    System.out.println("getAverage---> " + intSummaryStatistics.getAverage());
    System.out.println("getCount---> " + intSummaryStatistics.getCount());

  }

}
