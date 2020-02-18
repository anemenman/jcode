package jcode.ch_01_java_core.q_23_inner_interfaces;

import jcode.ch_01_java_core.q_23_inner_interfaces.InnerInterfaces_01_InterfaceInClass.PackageI;
import jcode.ch_01_java_core.q_23_inner_interfaces.InnerInterfaces_01_InterfaceInClass.ProtectedI;

public class InnerInterfaces_01_InterfaceInClass {

  interface PackageI {

    default void packageDef() {
      System.out.println("packageDef");
    }

    static void packageStatic() {
      System.out.println("packageStatic");
    }
  }

  private interface PrivateI {

    default void privateDef() {
      System.out.println("privateDef");
    }
  }

  protected interface ProtectedI {

    void protectedI();
  }

  // PrivateImpl implements PrivateI
  class PrivateImpl implements PrivateI {

  }

  public static void main(String[] args) {
    PrivateI privateI = new InnerInterfaces_01_InterfaceInClass().new PrivateImpl();
    privateI.privateDef();

    ProtectedI protectedI = new ProtectedImpl();
    protectedI.protectedI();

    PackageI packageI = new PackageImpl();
    packageI.packageDef();
    PackageI.packageStatic();
  }
}

class PackageImpl implements PackageI {

}

// Error!!!
// Can be only implemented for subclasses of InnerInterfaces_01_InterfaceInClass
//class ProtectedImpl implements ProtectedI {
//
//}

// Error!!!
//Can be only implemented into InnerInterfaces_01_InterfaceInClass class
//class PrivateImpl implements PrivateI {
//
//}

//ProtectedImpl implements ProtectedI
class ProtectedImpl extends InnerInterfaces_01_InterfaceInClass implements ProtectedI {

  @Override
  public void protectedI() {
    System.out.println("protectedI");
  }
}
