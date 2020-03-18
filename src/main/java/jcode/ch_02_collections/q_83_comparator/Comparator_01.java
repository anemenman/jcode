package jcode.ch_02_collections.q_83_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator_01 {

  public static void main(String[] args) {
    List<A> list = new ArrayList<>();
    list.add(new A(5));
    list.add(new A(1));
    list.add(new A(3));
    System.out.println("list --->" + list);
    list.sort(new AComparator());
    System.out.println("sorted --->" + list);
  }

}

class A {

  int a;

  A(int a) {
    this.a = a;
  }

  @Override
  public String toString() {
    return String.valueOf(a);
  }

  public int getA() {
    return a;
  }
}

class AComparator implements Comparator<A> {

  @Override
  public int compare(A o1, A o2) {
    return o1.a - o2.a;
  }
}
