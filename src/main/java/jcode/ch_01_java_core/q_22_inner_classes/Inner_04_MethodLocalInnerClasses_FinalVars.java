package jcode.ch_01_java_core.q_22_inner_classes;

public class Inner_04_MethodLocalInnerClasses_FinalVars {

  void outerMethod() {
    final int x = 98;
    System.out.println("Method inner class");
    class Inner {

      public void innerMethod() {
//        x++; <- Error!!! needs to be final or effectively final
        System.out.println("x = " + x);
      }
    }
    Inner inner = new Inner();
    inner.innerMethod();
  }

  public static void main(String[] args) {
    Inner_04_MethodLocalInnerClasses_FinalVars outer = new Inner_04_MethodLocalInnerClasses_FinalVars();
    outer.outerMethod();
  }
}
