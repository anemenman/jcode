package jcode.ch_02_collections.q_79_linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_01 {

  public static void main(String[] args) {
    LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(7, 7);
    linkedHashMap.put(3, 3);
    linkedHashMap.put(1, 1);
    System.out.println("linkedHashMap--->" + linkedHashMap);

    Map<Integer, Integer> map = new HashMap<>();
    map.put(7, 7);
    map.put(3, 3);
    map.put(1, 1);
    System.out.println("map--->" + map);
  }

}
