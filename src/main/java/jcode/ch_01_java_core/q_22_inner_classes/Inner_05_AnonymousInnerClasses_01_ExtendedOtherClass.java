package jcode.ch_01_java_core.q_22_inner_classes;

public class Inner_05_AnonymousInnerClasses_01_ExtendedOtherClass {

  // Anonymous class is a superclass of Demo
  static Demo demo = new Demo() {
    @Override
    public void show() {
      super.show();
      System.out.println("Method inner anonymous class");
    }
  };

  public static void main(String[] args) {
    demo.show();
  }
}

class Demo {

  public void show() {
    System.out.println("Method of superclass");
  }
}
