package jcode.ch_03_java_8.q_03_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda_01_Sort {

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(2);
    list.add(1);
    list.add(4);
    list.add(3);
    System.out.println("list--->" + list);

    Collections.sort(list, (o1, o2) -> {
      return o1.compareTo(o2);
    });

    //OR
    Collections.sort(list, (o1, o2) -> o1.compareTo(o2));

  }

}
