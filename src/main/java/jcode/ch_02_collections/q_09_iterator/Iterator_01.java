package jcode.ch_02_collections.q_09_iterator;

import java.util.Iterator;

public class Iterator_01 {

  public static void main(String[] args) {
    /**
     * public interface Iterator<E> {
     * boolean hasNext();
     * E next();
     * default void remove() {
     *         throw new UnsupportedOperationException("remove");
     *     }
     *
     *     default void forEachRemaining(Consumer<? super E> action) {
     *         Objects.requireNonNull(action);
     *         while (hasNext())
     *             action.accept(next());
     *     }
     *  }
     */
    Iterator iterator;
  }

}
