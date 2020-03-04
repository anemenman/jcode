package jcode.ch_02_collections.q_22_listiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_03_Remove {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>() {{
      add("a");
      add("b");
    }};
    System.out.println("list--->" + list);
    ListIterator<String> listIterator = list.listIterator();
    try {
      listIterator.remove(); //java.lang.IllegalStateException!!! call remove without next()
    } catch (Exception e) {
      e.printStackTrace();
    }

    if (listIterator.hasNext()) {
      String element = listIterator.next();
      listIterator.remove();
    }

    System.out.println("list--->" + list);
  }

}
