package jcode.ch_01_java_core.q_27_generics;

public class Generics_01_Class {

  public static void main(String[] args) {
    A<Double> a1 = new A<>();
    a1.set(5.5);
    System.out.println(a1.get());

    A<Integer> a2 = new A<>();
    a2.set(100);
    System.out.println(a2.get());
  }

}

class A<T extends Number> {

  T t;

  T get() {
    return this.t;
  }

  void set(T t) {
    this.t = t;
  }

  void printClass() {
    System.out.println(t.getClass());
  }

  void genericMethod(T t) {
    System.out.println(t);
  }

  T genericMethod2() {
    return t;
  }
}

//Error
//class AA<T extends Number> extends A<T extends Number> {
class AA<T extends Integer> extends A<T> {

  @Override
  void printClass() {
    System.out.println(t.getClass());
  }

  @Override
  void genericMethod(T t) {
    System.out.println(t);
  }

  @Override
  T genericMethod2() {
    return t;
  }
}
