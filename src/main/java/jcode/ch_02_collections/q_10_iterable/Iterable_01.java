package jcode.ch_02_collections.q_10_iterable;

public class Iterable_01 {

  public static void main(String[] args) {
    /**
     * public interface Iterable<T> {
     *
     * Iterator<T> iterator();
     * default void forEach(Consumer<? super T> action) {
     *         Objects.requireNonNull(action);
     *         for (T t : this) {
     *             action.accept(t);
     *         }
     *     }
     * default Spliterator<T> spliterator() {
     *         return Spliterators.spliteratorUnknownSize(iterator(), 0);
     *     }
     * }
     */
    Iterable iterable;
  }

}
