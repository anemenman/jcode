package jcode.ch_02_collections.q_51_hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class Hashtable_vs_HashMap_01 {

  public static void main(String[] args) {
    Hashtable<String, String> hashtable = new Hashtable<>();
    hashtable.put("a", "a");
    hashtable.put("a", "a");//size=1!!!
//    hashtable.put("aa", null);// Error!!! java.lang.NullPointerException -> no null value in Hashtable!!!
//    hashtable.put(null, null);// Error!!! java.lang.NullPointerException -> no null key in Hashtable!!!
    System.out.println("hashtable--->" + hashtable);

    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put(null, null);
    System.out.println("hashMap--->" + hashMap);
  }

}
