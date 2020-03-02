package jcode.ch_02_collections.q_02_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections_05_Synchronization {

  public static void main(String[] args) {

    //synchronizedList
    List<String> list = new ArrayList<>();
    List<String> synchronizedList = Collections.synchronizedList(list);
    System.out.println("list--->" + list);
    System.out.println("synchronizedList--->" + synchronizedList);
    System.out.println("synchronizedList class--->" + synchronizedList.getClass());
    System.out.println("synchronizedList == list--->" + (synchronizedList == list));

    //synchronizedMap
    Map<String, String> map = new HashMap<>();
    Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

    System.out.println("map--->" + map);
    System.out.println("synchronizedMap--->" + synchronizedMap);
    System.out.println("synchronizedMap class--->" + synchronizedMap.getClass());
    System.out.println("synchronizedMap == map--->" + (synchronizedMap == map));
  }
}
