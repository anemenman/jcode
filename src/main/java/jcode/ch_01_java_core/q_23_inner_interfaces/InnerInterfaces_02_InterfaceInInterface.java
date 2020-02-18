package jcode.ch_01_java_core.q_23_inner_interfaces;

import jcode.ch_01_java_core.q_23_inner_interfaces.I.InnerI;

public class InnerInterfaces_02_InterfaceInInterface {

  public static void main(String[] args) {
    InnerI innerI = new InnerImpl();
    innerI.i();

    I i = new IImpl();
    //i -> no methods there!!!
  }

}

interface I {

  // Error!!!
//  protected interface InnerI {


  //Only public for inner interface in other interface
  interface InnerI {

    void i();
  }
}

class InnerImpl implements InnerI {

  @Override
  public void i() {
    System.out.println("i----->");
  }
}

class IImpl implements I {

}
