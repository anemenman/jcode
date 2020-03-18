package jcode.ch_02_collections.q_80_linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_01 {

  public static void main(String[] args) {
    LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add(7);
    linkedHashSet.add(3);
    linkedHashSet.add(1);
    System.out.println("linkedHashSet--->" + linkedHashSet);

    Set<Integer> set = new HashSet<>();
    set.add(7);
    set.add(3);
    set.add(1);
    System.out.println("set--->" + set);
  }

}
