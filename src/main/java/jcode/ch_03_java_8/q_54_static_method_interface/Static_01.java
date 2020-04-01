package jcode.ch_03_java_8.q_54_static_method_interface;

public class Static_01 {

  public static void main(String[] args) {
    B.print();
    BB.print();
//    BB.print2(); --> Error!

    B b = new BB();
  }
}

interface B {

  static void print() {
    System.out.println("static interface...");
  }

  static void print2() {
    System.out.println("static interface 2...");
  }
}

class BB implements B {

  public static void print() {
    System.out.println("static BB ...");
  }
}
