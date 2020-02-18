package jcode.ch_01_java_core.q_22_inner_classes;

public class Inner_02_StaticClass {

  private int i;

  private static int i_static = 222;

  Inner_02_StaticClass(int i) {
    this.i = i;
  }

  static class InnerStatic {

    private int inner = 55;
    static int inner_static = 777;

    public void show() {
//      System.out.println("Inner static class---->i = " + i + "--->i_static = " + i_static);//Cannot access non static vars!!!
      System.out.println("Inner static class------->i_static = " + i_static);
    }
  }

  public static void main(String[] args) {
    InnerStatic i = new Inner_02_StaticClass.InnerStatic();
    i.show();
  }

}
