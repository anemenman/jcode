package jcode.ch_01_java_core.q_33_hashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashCode_02_Null {

  public static void main(String[] args) {
    Map<Integer, Integer> m = new HashMap<>();
    m.put(null, null);
    m.put(null, 2);
    m.put(1, null);
    m.put(2, 2);
    System.out.println(m);

    Set<Integer> s = new HashSet<>();
    s.add(null);
    s.add(1);
    s.add(null);
    s.add(2);
    System.out.println(s);
  }

}
