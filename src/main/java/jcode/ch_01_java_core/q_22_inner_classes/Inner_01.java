package jcode.ch_01_java_core.q_22_inner_classes;

public class Inner_01 {

  private int i;

  private static int i_static = 111;

  Inner_01(int i) {
    this.i = i;
  }

  class Inner {

//    static int i = 1; Cannot use static!!!

    public void show() {
      System.out.println("inner class..." + i + "--->" + i_static);
    }
  }

  public static void main(String[] args) {
    Inner i = new Inner_01(10).new Inner();
    i.show();
  }

}
