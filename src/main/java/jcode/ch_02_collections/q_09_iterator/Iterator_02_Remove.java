package jcode.ch_02_collections.q_09_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_02_Remove {

  public static void main(String[] args) {
    List<String> list = new ArrayList<String>() {{
      add("a");
      add("b");
    }};
    System.out.println("list--->" + list);
    Iterator<String> iterator = list.iterator();
    try {
      iterator.remove(); //java.lang.IllegalStateException!!! call remove without next()
    } catch (Exception e) {
      e.printStackTrace();
    }

    if (iterator.hasNext()) {
      String element = iterator.next();
      iterator.remove();
    }

    System.out.println("list--->" + list);
  }

}
