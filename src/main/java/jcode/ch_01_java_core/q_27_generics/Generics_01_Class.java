package jcode.ch_01_java_core.q_27_generics;

public class Generics_01_Class {

  public static void main(String[] args) {
    A<String> a1 = new A<>();
    a1.set("a");
    System.out.println(a1.get());

    A<Integer> a2 = new A<>();
    a2.set(100);
    System.out.println(a2.get());
  }

}

class A<T> {

  private T t;

  T get() {
    return this.t;
  }

  void set(T t) {
    this.t = t;
  }
}
