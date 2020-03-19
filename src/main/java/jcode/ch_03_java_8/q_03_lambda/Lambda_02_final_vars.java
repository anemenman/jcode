package jcode.ch_03_java_8.q_03_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda_02_final_vars {

  public static void main(String[] args) {
    int i = 0;
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(2);
    list.add(1);
    list.add(4);
    list.add(3);
    System.out.println("list--->" + list);

    Collections.sort(list, (o1, o2) -> {
//      i++;//should be final or effective final
      return o1.compareTo(o2);
    });
  }

}
