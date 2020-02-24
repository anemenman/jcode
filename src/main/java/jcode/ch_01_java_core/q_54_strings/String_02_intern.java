package jcode.ch_01_java_core.q_54_strings;

public class String_02_intern {

  public static void main(String[] args) {
    String s = "String";
    System.out.println(s);
    System.out.println(s.intern());//Get string from string pull
    String s2 = "String2";
    String s3 = "String";
    System.out.println(s == s3);
    System.out.println(s.intern() == s2.intern());
    System.out.println(s.intern() == s3.intern());
  }

}
