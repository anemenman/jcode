package jcode.ch_02_collections.q_66_queue_deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_01_Hierarchy {

  public static void main(String[] args) {

    /**
     * public interface Queue<E> extends Collection<E>
     *
     *   boolean add(E e);
     *   boolean offer(E e); ---> add this method is generally preferable to
     *   E remove();         ---> Retrieves and removes the head of this queue, NoSuchElementException if this queue is empty
     *   E poll();           ---> Retrieves and removes the head of this queue, null if this queue is empty
     *   E element();        ---> Retrieves, but does not remove, the head of this queue. NoSuchElementException if this queue is empty
     *   E peek();           ---> Retrieves, but does not remove, the head of this queue, null if this queue is empty
     */
    Queue queue;

    /**
     * An unbounded priority {@linkplain Queue queue} based on a priority heap.
     */
    PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    priorityQueue.add("a");
    priorityQueue.add("b");
    priorityQueue.add("c");

    /**
     * public interface Deque<E> extends Queue<E> {
     *
     *   ...
     *   void addFirst(E e);
     *   void addLast(E e);
     *   E getFirst();
     *   E getLast();
     *   E pollFirst();
     *   E pollLast();
     *   ...
     *
     */
    Deque deque;

    LinkedList<String> linkedList = new LinkedList<>();

    ArrayDeque<String> arrayDeque = new ArrayDeque<>();
  }

}
