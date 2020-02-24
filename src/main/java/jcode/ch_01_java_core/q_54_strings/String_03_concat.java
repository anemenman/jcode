package jcode.ch_01_java_core.q_54_strings;

public class String_03_concat {

  public static void main(String[] args) {
    String s1 = "s1";
    String s2 = s1.concat("a");
    System.out.println(s2);

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(s2);
    System.out.println(stringBuilder);
  }

}
