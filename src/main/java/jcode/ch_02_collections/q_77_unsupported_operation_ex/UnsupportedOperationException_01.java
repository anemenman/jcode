package jcode.ch_02_collections.q_77_unsupported_operation_ex;

import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationException_01 {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3);

    System.out.println("list--->" + list);
    System.out.println("list.getClass()--->" + list.getClass());

    try {
      list.add(5);
    } catch (UnsupportedOperationException e) {
      e.printStackTrace();
    }
  }

}
