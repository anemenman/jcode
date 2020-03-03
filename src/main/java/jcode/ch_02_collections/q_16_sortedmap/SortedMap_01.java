package jcode.ch_02_collections.q_16_sortedmap;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_01 {

  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    map.put("a", "aaa");
    map.put("aaa", "aaaaaaaaa");
    map.put("b", "bbb");
    map.put("c", "ccc");
    map.put("Aa", "Aa");
    map.put("BB", "BB");

    System.out.println("a".hashCode());
    System.out.println("aaa".hashCode());
    System.out.println("b".hashCode());
    System.out.println("c".hashCode());
    System.out.println("Aa".hashCode());
    System.out.println("BB".hashCode());
    System.out.println("HashMap--->" + map);

    //public interface SortedMap<K,V> extends Map<K,V> {
    SortedMap<String, String> stringSortedMap = new TreeMap<>();
    stringSortedMap.put("a", "aaa");
    stringSortedMap.put("aaa", "aaaaaaaaa");
    stringSortedMap.put("b", "bbb");
    stringSortedMap.put("c", "ccc");
    stringSortedMap.put("Aa", "Aa");
    stringSortedMap.put("BB", "BB");
    System.out.println("SortedMap--->" + stringSortedMap);

    System.out.println("stringSortedMap.keySet()--->");
    for (String k : stringSortedMap.keySet()) {
      System.out.println("k--->" + k);
    }

    System.out.println("stringSortedMap.entrySet()---->");
    for (Map.Entry<String, String> entry : stringSortedMap.entrySet()) {
      System.out.println("entry--->" + entry);
    }

    System.out.println("stringSortedMap.values()--->");
    for (String v : stringSortedMap.values()) {
      System.out.println("v--->" + v);
    }
  }
}
