package jcode.ch_01_java_core.q_101_instanseof_vs_getclass;

public class GetClass_01_IncomparableTypes {

  public static void main(String[] args) {

    System.out
        .println("aaa".getClass() == String.class); //OK!!!

    //Copmilation ERROR!!! Operator == cannot be applied to diff types
//    System.out.println("aaa".getClass() == Object.class);

  }

}
