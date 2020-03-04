package jcode.ch_02_collections.q_29_linkedlist;

import java.util.LinkedList;

public class LinkedList_01 {

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<Integer>() {{
      add(1);
      add(2);
      add(3);
    }};
    System.out.println("linkedList.getFirst()--->" + linkedList.getFirst());
    System.out.println("linkedList.getLast()--->" + linkedList.getLast());
    linkedList.addFirst(0);
    linkedList.addLast(4);
    System.out.println("linkedList--->" + linkedList);
  }
}
