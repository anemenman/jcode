package jcode.ch_02_collections.q_17_CollectionToArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CollectionToArray_01 {

  public static void main(String[] args) {
    List<String> l = new ArrayList<String>() {{
      add("a");
      add("b");
    }};

//    String[] array = l.toArray(new String[l.size()]);<---OLD
    String[] array = l.toArray(new String[0]);//<---NEW CORRECT!!!
    System.out.println("l.size()--->" + l.size());
    System.out.println("array.length--->" + array.length);

    Set<String> set = new HashSet<String>() {{
      add("a");
      add("b");
    }};
    String[] arr2 = set.toArray(new String[0]);
    System.out.println("arr2.length--->" + arr2.length);

    Queue<String> queue = new PriorityQueue<String>() {{
      add("a");
      add("b");
    }};
    String[] arr3 = queue.toArray(new String[0]);
    System.out.println("arr3.length--->" + arr3.length);
  }

}
