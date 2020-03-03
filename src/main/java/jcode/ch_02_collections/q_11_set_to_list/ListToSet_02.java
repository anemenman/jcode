package jcode.ch_02_collections.q_11_set_to_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet_02 {

  public static void main(String[] args) {
    List<String> l = new ArrayList<>();

    //public HashSet(Collection<? extends E> c) {
    Set<String> s = new HashSet<>(l);
  }

}
