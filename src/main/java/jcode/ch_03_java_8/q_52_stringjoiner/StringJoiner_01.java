package jcode.ch_03_java_8.q_52_stringjoiner;

import java.util.StringJoiner;

public class StringJoiner_01 {

  public static void main(String[] args) {
    StringJoiner stringJoiner = new StringJoiner(",");
    stringJoiner.add("a");
    stringJoiner.add("b");
    stringJoiner.add("c");
    System.out.println(stringJoiner);
  }

}
