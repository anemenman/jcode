package jcode.ch_03_java_8.q_05_method_ref;

public class Method_ref_01_StaticMethod {

  public static void saySomething() {
    System.out.println("Hello, this is static method.");
  }

  public static void main(String[] args) {
    I i = Method_ref_01_StaticMethod::saySomething;
    i.s();
  }

}

@FunctionalInterface
interface I {

  void s();
}

