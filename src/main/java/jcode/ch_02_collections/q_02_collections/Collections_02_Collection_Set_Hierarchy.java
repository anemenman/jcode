package jcode.ch_02_collections.q_02_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collections_02_Collection_Set_Hierarchy {

  public static void main(String[] args) {

    //public interface Set<E> extends Collection<E>
    Set s;

    //public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, java.io.Serializable
    HashSet hs;

    //public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, java.io.Serializable
    LinkedHashSet lhs;

    //public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, java.io.Serializable
    TreeSet ts;
  }

}
