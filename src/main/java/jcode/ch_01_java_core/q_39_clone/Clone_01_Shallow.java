package jcode.ch_01_java_core.q_39_clone;

public class Clone_01_Shallow {

  public static void main(String[] args) {
    try {
      A a = new A(1, "s");
      System.out.println(a);
      A a2 = (A) a.clone(); // Error!!! A must have interface Cloenable
      System.out.println(a2);
      System.out.println(a == a2);
      System.out.println(a.equals(a2));

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    try {
      AA a = new AA(1, "s");
      System.out.println(a);
      AA a2 = (AA) a.clone();
      System.out.println(a2);
      System.out.println(a == a2);
      System.out.println(a.equals(a2));
      System.out.println(a.getS().equals(a2.getS()));
      System.out.println(a.getAaa().equals(a2.getAaa())); // Clone link!!!

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
}

class A {

  int a;

  String s;

  A(int a, String s) {
    this.a = a;
    this.s = s;
  }

  @Override
  public String toString() {
    return "{a: " + a + ", s: " + s + "}";
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class AA implements Cloneable {

  int a;

  String s;

  AAA aaa;

  AA(int a, String s) {
    this.a = a;
    this.s = s;
    this.aaa = new AAA();
  }

  AAA getAaa() {
    return aaa;
  }

  String getS() {
    return s;
  }

  @Override
  public String toString() {
    return "{a: " + a + ", s: " + s + ", aaa: " + aaa + "}";
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

class AAA {

}
