package jcode.ch_02_collections.q_40_arraylist_sublist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_01_Sublist {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>() {{
      add(1);
      add(2);
      add(3);
      add(4);
      add(5);
    }};

    System.out.println("list--->" + list);
    List<Integer> subList = list.subList(1, 3);
    System.out.println("subList--->" + subList);
  }

}
