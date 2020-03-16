package jcode.ch_02_collections.q_64_hashmap_to_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetToHashMap_01 {

  public static void main(String[] args) {
    Set<String> set = new HashSet<String>() {{
      add("a");
      add("b");
      add("c");
    }};

    Map<String, String> map = new HashMap<>();

    for (String entry : set) {
      map.put(entry, entry);
    }
  }

}
