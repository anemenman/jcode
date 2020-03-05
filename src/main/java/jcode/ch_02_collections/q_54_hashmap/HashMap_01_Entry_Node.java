package jcode.ch_02_collections.q_54_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap_01_Entry_Node {

  public static void main(String[] args) {

    /**
     * interface Entry<K,V> {
     *
     * K getKey();
     * V getValue();
     * V setValue(V value);
     * boolean equals(Object o);
     * int hashCode();
     * public static <K extends Comparable<? super K>, V> Comparator<Map.Entry<K,V>> comparingByKey() {
     * public static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue() {
     * public static <K, V> Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp) {
     * public static <K, V> Comparator<Map.Entry<K, V>> comparingByValue(Comparator<? super V> cmp) {
     */
    Map.Entry<String, String> entry;

    Map<String, String> map = new HashMap<>();
    map.put("Aa", "a");
    map.put("BB", "a");

    /**
     * static class Node<K,V> implements Map.Entry<K,V> {
     *         final int hash;
     *         final K key;
     *         V value;
     *         Node<K,V> next;
     */
    for (Map.Entry<String, String> entry1 : map.entrySet()) {
      System.out.println("entry class  ---> " + entry1.getClass());//java.util.HashMap$Node
      System.out.println(entry1);
    }
  }

}
