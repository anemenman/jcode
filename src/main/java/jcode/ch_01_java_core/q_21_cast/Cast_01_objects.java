package jcode.ch_01_java_core.q_21_cast;

public class Cast_01_objects {

  public static void main(String[] args) {
    try {
      A a = new A();
      a.a();
      ((B) a).b();
      ((C) ((B) a)).c();
    } catch (Exception e) {
      System.out.println("Should be ClassCastException...");
      e.printStackTrace();
    }

    C c = new C();
    B b = c; //Auto cast
    C c2 = (C) b;//(cast)
    c2.c();
    c2.b();
    c2.a();
  }
}

class A {

  void a() {
    System.out.println("a");
  }
}

class B extends A {

  void b() {
    System.out.println("b");
  }
}

class C extends B {

  void c() {
    System.out.println("c");
  }
}
