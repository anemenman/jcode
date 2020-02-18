package jcode.ch_01_java_core.q_25_override;

public class Override_04_Throws {

  void overrideReturnedThrows() throws Exception {
    System.out.println("Default overrideReturnedThrows--->");
  }

  void overrideReturnedThrowsUp() throws Exception {
    System.out.println("Default overrideReturnedThrowsUp--->");
  }

  void overrideReturnedThrowsDown() throws A_04_Exception {
    System.out.println("Default overrideReturnedThrowsDown--->");
  }

}

class A_04 extends Override_04_Throws {

  @Override
  void overrideReturnedThrows() {
    System.out.println("Override overrideReturnedThrows--->no throws");
  }

  @Override
  void overrideReturnedThrowsUp() throws A_04_Exception {
    System.out.println("Override overrideReturnedThrowsUp--->A_04_Exception");
  }

  //Error!!! Cannot override for down throws!!!
//  @Override
//  void overrideReturnedThrowsDown() throws Exception {
//    System.out.println("Override overrideReturnedThrowsDown--->Exception");
//  }
}

class A_04_Exception extends Exception {

}
