package jcode.ch_01_java_core.q_33_hashcode;

public class HashCode_01_Collision {

  public static void main(String[] args) {

    System.out.println("Aa".hashCode());
    System.out.println("BB".hashCode());

    System.out.println("AaAa".hashCode());
    System.out.println("BBBB".hashCode());
    System.out.println("AaBB".hashCode());
    System.out.println("BBAa".hashCode());
  }

}
