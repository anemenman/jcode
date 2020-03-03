package jcode.ch_02_collections.q_18_symmetric_diff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SymmetricDiff_01_retainAll_removeAll_addAll {

  public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> list11 = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 5));

    Collection<Integer> symmetricDiff = symmetricDiff(list1, list2);
    System.out.println("symmetricDiff--->" + symmetricDiff);//[1, 5]

    list1.retainAll(list2);
    System.out.println("list1.retainAll(list2)--->" + list1);//[2, 3]

    list11.removeAll(list2);
    System.out.println("list11.removeAll(list2)--->" + list11);//[1]
  }

  public static <T> Collection<T> symmetricDiff(Collection<T> a, Collection<T> b) {

    //a = [1, 2, 3]
    //b = [2, 3, 5]

    Collection<T> result = new ArrayList<>(a);//[1, 2, 3]
    Collection<T> intersection = new ArrayList<>(a);
    intersection.retainAll(b); // [2, 3]
    result.addAll(b); //[1, 2, 3, 2, 3, 5]
    result.removeAll(intersection);//[1, 5]

    return result;
  }

}
