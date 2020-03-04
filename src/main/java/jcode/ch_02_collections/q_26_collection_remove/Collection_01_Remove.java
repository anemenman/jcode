package jcode.ch_02_collections.q_26_collection_remove;

import java.util.ArrayList;
import java.util.List;

public class Collection_01_Remove {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>() {{
      add("a");
      add("b");
      add("c");
    }};

//    System.out.println("list 1--->" + list);
//    list.remove(0);
//    System.out.println("list 2--->" + list);
//
//    System.out.println("list.get(0)--->" + list.get(0));//OK
//    list.iterator().hasNext();//OK

    for (String element : list) {
      System.out.println(element);
      if (element != null) {
        list.remove(element); // Error! ConcurrentModificationException!
        System.out.println("removed...");
        break;
      }
    }

    System.out.println("list 3--->" + list);
  }

}
