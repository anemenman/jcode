package jcode.ch_02_collections.q_29_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_02_DescendingIterator {

  public static void main(String[] args) {
    LinkedList<Integer> linkedList = new LinkedList<Integer>() {{
      add(1);
      add(2);
      add(3);
    }};

    Iterator<Integer> iterator = linkedList.descendingIterator();
    while (iterator.hasNext()) {
      Integer i = iterator.next();
      System.out.println(i);
    }
  }

}
