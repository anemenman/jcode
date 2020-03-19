package jcode.ch_03_java_8.q_05_method_ref;

public class Method_ref_02_InstanceMethod {

  public void saySomething() {
    System.out.println("Hello, this is instance method.");
  }

  public static void main(String[] args) {

    Method_ref_02_InstanceMethod instanceMethod = new Method_ref_02_InstanceMethod();
    F f = instanceMethod::saySomething;
    f.f();
  }

}

@FunctionalInterface
interface F {

  void f();
}
