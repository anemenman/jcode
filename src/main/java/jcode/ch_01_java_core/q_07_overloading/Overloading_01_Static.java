package jcode.ch_01_java_core.q_07_overloading;

public class Overloading_01_Static {

}


class O {

  public static void s() {

  }

  public static void s(int a) {

  }

  public static void s(int a, int b) {

  }

  //Error!!! - > the same method but static above!
//  public void s() {
//
//  }


  //Overloading static by non-static!
  public void s(int a, int b, int c) {

  }
}
