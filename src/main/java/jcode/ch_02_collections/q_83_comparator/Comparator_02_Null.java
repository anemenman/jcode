package jcode.ch_02_collections.q_83_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator_02_Null {

  public static void main(String[] args) {
    List<B> list = new ArrayList<>();
    list.add(new B(5));
    list.add(new B(null));
    System.out.println("list --->" + list);
    list.sort(Comparator.comparing(B::getB, Comparator.nullsFirst(Comparator.naturalOrder())));
    System.out.println("sorted --->" + list);

    List<B> list2 = new ArrayList<>();
    list2.add(new B(5));
    list2.add(new B(2));
    list2.add(null);
    System.out.println("list2 --->" + list2);
    list2.sort(new BComparator());
    System.out.println("sorted 2--->" + list2);
  }

}

class B {

  Integer b;

  B(Integer b) {
    this.b = b;
  }

  @Override
  public String toString() {
    return String.valueOf(b);
  }

  public Integer getB() {
    return b;
  }
}

class BComparator implements Comparator<B> {

  @Override
  public int compare(B o1, B o2) {
    int result = 0;
    if (o1 != null && o2 != null) {
      return o1.getB().compareTo(o2.getB());
    } else if (o1 != null) {
      return 1;
    } else if (o2 != null) {
      return -1;
    }
    return result;
  }
}

