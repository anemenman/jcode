package jcode.ch_02_collections.q_13_map_key_values_set;

import java.util.HashMap;
import java.util.Map;

public class KeyValuesSet_01 {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<String, String>() {{
      put("a", "aaa");
      put("b", "bbb");
    }};

    //Set<K> keySet();
    System.out.println("map.keySet()--->" + map.keySet());

    //Collection<V> values();
    System.out.println("map.values()--->" + map.values());
  }

}
