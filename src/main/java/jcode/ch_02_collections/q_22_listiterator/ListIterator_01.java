package jcode.ch_02_collections.q_22_listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ListIterator_01 {

  public static void main(String[] args) {

    /**
     * public interface ListIterator<E> extends Iterator<E> {
     *  boolean hasNext();
     *  E next();
     *  boolean hasPrevious();
     *  E previous();
     *  int nextIndex();
     *  int previousIndex();
     *  void remove();
     *  void set(E e);
     *  void add(E e);
     * }
     */
    List<String> list = new ArrayList<String>() {{
      add("a");
    }};

    ListIterator<String> listIterator = list.listIterator();
    while (listIterator.hasNext()) {
      String element = listIterator.next();
      System.out.println("next--->" + element);

      if (listIterator.hasPrevious()) {
        element = listIterator.previous();
        System.out.println("previous--->" + element);
        listIterator.next();
      }
    }

    ListIterator<String> listIterator2 = list.listIterator();
    while (listIterator2.hasPrevious()) {
      String element = listIterator.previous();
      System.out.println(element);
    }
  }

}
