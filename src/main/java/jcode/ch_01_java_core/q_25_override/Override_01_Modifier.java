package jcode.ch_01_java_core.q_25_override;

public class Override_01_Modifier {

  void overrideModifierPackaged() {
    System.out.println("Default packaged");
  }

  public static void main(String[] args) {
    A_01 a = new A_01();
    a.overrideModifierPackaged();
  }

}


class A_01 extends Override_01_Modifier {

  //We can override modifier for package->protected-public
  @Override
  protected void overrideModifierPackaged() {
    System.out.println("Override package->protected!");
  }
}
