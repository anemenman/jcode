package jcode.ch_01_java_core.q_25_override;

public class Override_03_ArgumentNames {

  void overrideArgumentNames(int a) {
    System.out.println("Default overrideArgumentNames --> a");
  }

  public static void main(String[] args) {
    A_03 a = new A_03();
    a.overrideArgumentNames(11);
  }

}

class A_03 extends Override_03_ArgumentNames {

  @Override
  void overrideArgumentNames(int b) {
    System.out.println("override overrideArgumentNames --> b");
  }
}
