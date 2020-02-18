package jcode.ch_01_java_core.q_27_generics;

public class Generics_04_Extended {

  public static <T extends Ext_02> void ext(T t) {
    System.out.println(t);
  }

  //Error!!! only for wildcards
//  public static <K super Ext_02> void sup(K k) {
//    System.out.println(k);
//
//    Number d;
//  }

  public static void main(String[] args) {
    ext(new Ext_02());
    ext(new Ext_03());
//    ext(new Ext_01()); Error!!!
  }

}

class Ext_01 {

}

class Ext_02 extends Ext_01 {

}

class Ext_03 extends Ext_02 {

}
