package jcode.ch_02_collections.q_81_lru_cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_LRUCache_01 {

  public static void main(String[] args) {
    LRUCache<Integer, Integer> lruCache = new LRUCache<>(10);
    lruCache.put(1, 1);
    lruCache.put(2, 2);
    lruCache.put(3, 3);
    lruCache.put(4, 4);
    lruCache.put(5, 5);
    System.out.println("lruCache---->" + lruCache);
    lruCache.get(1);
    lruCache.put(6, 6);
    System.out.println("lruCache---->" + lruCache);
    lruCache.put(3, 3);
    System.out.println("lruCache---->" + lruCache);
  }

}

class LRUCache<K, V> extends LinkedHashMap<K, V> {

  private final static int MAX_ENTRIES = 5;

  public LRUCache(int initialCapacity) {
    super(initialCapacity, 0.85f, true);
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
    System.out.println("Call removeEldestEntry!!!");
    return size() > MAX_ENTRIES;
  }
}
