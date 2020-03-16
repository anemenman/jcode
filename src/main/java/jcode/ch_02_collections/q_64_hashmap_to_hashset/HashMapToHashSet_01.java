package jcode.ch_02_collections.q_64_hashmap_to_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapToHashSet_01 {

  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>() {{
      put("a", "a");
      put("b", "b");
      put("c", "c");
    }};

    System.out.println("map--->" + map);
    Set<String> set = new HashSet<>(map.keySet());
    System.out.println("set--->" + set);
  }
}
