package jcode.ch_02_collections.q_02_collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Collections_04_Map_Hierarchy {

  public static void main(String[] args) {

    /**
     * public interface Map<K,V>
     *
     *   int size();
     *   boolean isEmpty();
     *   boolean containsKey(Object key);
     *   boolean containsValue(Object value);
     *   V get(Object key);
     *   V put(K key, V value);
     *   V remove(Object key);
     *   void putAll(Map<? extends K, ? extends V> m);
     *   void clear();
     *   Set<K> keySet();
     *   Collection<V> values();
     *   Set<Map.Entry<K, V>> entrySet();
     *   boolean equals(Object o);
     *   int hashCode();
     *   default V getOrDefault(Object key, V defaultValue) {
     *   default void forEach(BiConsumer<? super K, ? super V> action) {
     *   default void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
     *   default V putIfAbsent(K key, V value) {
     *   default boolean remove(Object key, Object value) {
     *   default boolean replace(K key, V oldValue, V newValue) {
     *   default V replace(K key, V value) {
     *   default V computeIfAbsent(K key,Function<? super K, ? extends V> mappingFunction) {
     *   default V computeIfPresent(K key,BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
     *   default V compute(K key,BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
     *   default V merge(K key, V value,BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
     *
     *   interface Entry<K,V> {
     *   K getKey();
     *   V getValue();
     *   V setValue(V value);
     *   boolean equals(Object o);
     *   int hashCode();
     *   public static <K extends Comparable<? super K>, V> Comparator<Map.Entry<K,V>> comparingByKey() {
     *   public static <K, V extends Comparable<? super V>> Comparator<Map.Entry<K,V>> comparingByValue() {
     *   public static <K, V> Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp) {
     *   public static <K, V> Comparator<Map.Entry<K, V>> comparingByValue(Comparator<? super V> cmp) {
     */
    Map map;

    //public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, java.io.Serializable {
    Hashtable hashtable;

    //public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable {
    HashMap hashMap;

    //public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V> {
    LinkedHashMap linkedHashMap;

    //public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, java.io.Serializable {
    TreeMap treeMap;
  }

}
