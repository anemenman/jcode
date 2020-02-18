package jcode.ch_01_java_core.q_25_override;

public class Override_02_ReturnedType {

  int overrideReturnedTypePrimitives(int i) {
    System.out.println("Default overrideReturnedTypePrimitives--->" + i);
    return i;
  }

  B_02_ex overrideReturnedTypeDowncasting() {
    System.out.println("overrideReturnedTypeDowncasting int--->");
    return new B_02_ex();
  }

  B_02 overrideReturnedTypeUpcasting() {
    System.out.println("Default overrideReturnedTypeUpcasting--->");
    return new B_02();
  }

  public static void main(String[] args) {
    A_02 a = new A_02();
    a.overrideReturnedTypeUpcasting();
  }
}

class A_02 extends Override_02_ReturnedType {

  //override with returned Upcasting
  @Override
  B_02_ex overrideReturnedTypeUpcasting() {
    System.out.println("override overrideReturnedTypeUpcasting--->");
    return new B_02_ex();
  }

  //Error!!
  //override with returned Downcasting does not work!!!
//  @Override
//  B_02 overrideReturnedTypeDowncasting() {
//    System.out.println("override overrideReturnedTypeDowncasting--->");
//    return new B_02();
//  }

  //Error!!! does not work for primitives for upcasting!!!
//  @Override
//  long overrideReturnedTypePrimitives(int i) {
//    System.out.println("Default overrideReturnedTypePrimitives--->" + i);
//    return 1L;
//  }

  //Error!!! does not work for primitives for downcasting!!!
//  @Override
//  byte overrideReturnedTypePrimitives(int i) {
//    System.out.println("Default overrideReturnedTypePrimitives--->" + i);
//    return (byte) i;
//  }
}

class B_02 {

}

class B_02_ex extends B_02 {

}
