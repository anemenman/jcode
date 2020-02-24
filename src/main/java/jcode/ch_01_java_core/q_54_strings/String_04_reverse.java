package jcode.ch_01_java_core.q_54_strings;

public class String_04_reverse {

  public static void main(String[] args) {
    String s = "12345";
    StringBuilder stringBuilder = new StringBuilder(s);
    stringBuilder.reverse();
    System.out.println(stringBuilder);
  }

}
