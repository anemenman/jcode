package jcode.ch_02_collections.q_79_linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMap_02_accessOrder {

  public static void main(String[] args) {
    LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>(10, 0.85f, true);
    linkedHashMap.put(7, 7);
    linkedHashMap.put(3, 3);
    linkedHashMap.put(1, 1);
    System.out.println("linkedHashMap--->" + linkedHashMap);

    System.out.println(linkedHashMap.get(7));
    System.out.println("linkedHashMap--->" + linkedHashMap);
  }

}
