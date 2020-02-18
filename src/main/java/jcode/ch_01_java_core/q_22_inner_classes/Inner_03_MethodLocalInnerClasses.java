package jcode.ch_01_java_core.q_22_inner_classes;

public class Inner_03_MethodLocalInnerClasses {

  void outerMethod() {
    System.out.println("Method outer class");
    // Inner class is local for method outerMethod()
    class Inner {

      public void innerMethod() {
        System.out.println("Method local inner class...");
      }
    }
    Inner inner = new Inner();
    inner.innerMethod();
  }

  public static void main(String[] args) {
    Inner_03_MethodLocalInnerClasses outer = new Inner_03_MethodLocalInnerClasses();
    outer.outerMethod();
  }

}
