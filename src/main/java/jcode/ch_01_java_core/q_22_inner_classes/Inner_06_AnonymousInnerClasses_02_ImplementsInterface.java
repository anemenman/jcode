package jcode.ch_01_java_core.q_22_inner_classes;

public class Inner_06_AnonymousInnerClasses_02_ImplementsInterface {

  // Anonymous class implements Hello
  static Hello h = new Hello() {
    public void show() {
      System.out.println("Method inner anonymous class");
    }
  };

  public static void main(String[] args) {
    h.show();
  }
}

interface Hello {

  void show();
}
