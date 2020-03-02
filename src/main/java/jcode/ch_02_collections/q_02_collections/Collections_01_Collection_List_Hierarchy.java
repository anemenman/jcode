package jcode.ch_02_collections.q_02_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collections_01_Collection_List_Hierarchy {

  public static void main(String[] args) {
    /**
     * public interface Iterable<T>
     *
     *   Iterator<T> iterator();
     *   default void forEach(Consumer<? super T> action) {
     *   default Spliterator<T> spliterator() {
     */
    Iterable it;

    /**
     * public interface Collection<E> extends Iterable<E>
     *
     *   int size();
     *   boolean isEmpty();
     *   boolean contains(Object o);
     *   Iterator<E> iterator();
     *   boolean add(E e);
     *   boolean remove(Object o);
     *   boolean containsAll(Collection<?> c);
     *   boolean addAll(Collection<? extends E> c);
     *   boolean removeAll(Collection<?> c);
     *   default boolean removeIf(Predicate<? super E> filter) {
     *   boolean retainAll(Collection<?> c);
     *   void clear();
     *   boolean equals(Object o);
     *   int hashCode();
     *   default Spliterator<E> spliterator()
     *   default Stream<E> stream()
     *   default Stream<E> parallelStream()
     */
    Collection c;

    //Collection->List->ArrayList...LinkedList...Vector
    List l;

    //public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
    ArrayList al;

    //public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, java.io.Serializable
    LinkedList ll;

    //public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable
    Vector v;
  }

}
