package jcode.ch_02_collections.q_11_set_to_list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList_01 {

  public static void main(String[] args) {
    Set<String> s = new HashSet<>();

    //public ArrayList(Collection<? extends E> c) {
    List<String> l = new ArrayList<>(s);
  }

}
