package jcode.ch_01_java_core.q_101_instanseof_vs_getclass;

public class InstanceOf_vs_getClass_01 {

  public static void main(String[] args) {

    A a = new A();
    AA aa = new AA();

    System.out.println("a instanceof A ---> " + (a instanceof A)); //true
    System.out.println("a instanceof AA ---> " + (a instanceof AA)); //false
    System.out.println("aa instanceof A ---> " + (aa instanceof A)); //true
    System.out.println("aa instanceof AA ---> " + (aa instanceof AA)); //true

    System.out
        .println("a.getClass().equals(A.class) ---> " + (a.getClass().equals(A.class))); //true
    System.out
        .println("a.getClass().equals(AA.class) ---> " + (a.getClass().equals(AA.class))); //false
    System.out
        .println("aa.getClass().equals(A.class) ---> " + (aa.getClass().equals(A.class))); //false
    System.out
        .println("aa.getClass().equals(AA.class) ---> " + (aa.getClass().equals(AA.class))); //true

    System.out.println(aa.getClass() == A.class);
  }

}


class A {

}

class AA extends A {

}
