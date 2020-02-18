package jcode.ch_01_java_core.q_27_generics;

import java.util.ArrayList;
import java.util.List;

public class Generics_05_Wildcards {

  //all types ---> its same as using <? extends Object>
  static void allTypes(List<?> a) {
    System.out.println(a);
  }

  static void extendsTypes(List<? extends G_02> a) {
    System.out.println(a);
  }

  static void superTypes(List<? super G_02> a) {
    System.out.println(a);
  }

  public static void main(String[] args) {
    allTypes(new ArrayList<String>());
    extendsTypes(new ArrayList<G_02>());
//    extendsTypes(new ArrayList<G_01>()); Error
    extendsTypes(new ArrayList<G_03>());

//    superTypes(new ArrayList<G_03>()); Error
    superTypes(new ArrayList<G_01>());
    superTypes(new ArrayList<G_02>());
  }

}

class G_01 {

}

class G_02 extends G_01 {

}

class G_03 extends G_02 {

}
