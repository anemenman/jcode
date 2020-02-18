package jcode.ch_01_java_core.q_27_generics;

public class Generics_03_Method {

  public static <T> boolean isEqual(T t1, T t2) {
    if (t1 == null || t2 == null) {
      return false;
    }
    return t1.equals(t2);
  }

  public static void main(String[] args) {

    System.out.println(isEqual(1, 2));
    System.out.println(isEqual(2, 2));
    System.out.println(isEqual(null, 2));
  }

}
