package jcode.ch_02_collections.q_60_identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMap_01 {

  public static void main(String[] args) {

    /**
     * public class IdentityHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, java.io.Serializable, Cloneable
     *
     */
    IdentityHashMap<A, String> identityHashMap = new IdentityHashMap<>();
    identityHashMap.put(new A(), "a");
    identityHashMap.put(new A(), "a");
    System.out.println("identityHashMap--->" + identityHashMap);//Size is 2!!!

    Map<A, String> map = new HashMap<>();
    map.put(new A(), "a");
    map.put(new A(), "a");
    System.out.println("map--->" + map);//Sie is 1!!!
  }

}

class A {

  @Override
  public boolean equals(Object o) {
    return true;//All objects are true!!!
  }

  @Override
  public int hashCode() {
    return 31;
  }
}
