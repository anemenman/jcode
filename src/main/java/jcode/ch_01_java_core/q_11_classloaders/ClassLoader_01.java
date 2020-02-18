package jcode.ch_01_java_core.q_11_classloaders;

import static java.lang.Class.forName;

public class ClassLoader_01 {

  public static void main(String[] args) {

    //We cannot get the name for base class loader for rt.jar!!!
    System.out.println("Default classloader for Object---->" + Object.class.getClassLoader());
    System.out.println(
        "Get name of class loader of ClassLoader_01---->" + ClassLoader_01.class.getClassLoader());

    try {
      forName("SSS");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
