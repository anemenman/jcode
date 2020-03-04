package jcode.ch_02_collections.q_22_listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator_02_NoSuchElementException {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>() {{
      add("a");
    }};

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }

    Iterator<String> iterator2 = list.iterator();
    while (true) {
      String element = iterator2.next();
      System.out.println(element);
    }
  }

}
