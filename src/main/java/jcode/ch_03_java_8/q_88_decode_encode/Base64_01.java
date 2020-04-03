package jcode.ch_03_java_8.q_88_decode_encode;

import java.util.Base64;

public class Base64_01 {

  public static void main(String[] args) {
    byte[] nat = new byte[]{'a', 'b', 'c'};
    System.out.println("native--->");
    for (byte b : nat) {
      System.out.println(b);
    }

    System.out.println("encoded---->");
    byte[] encoded = Base64.getEncoder().encode(nat);
    String encodedStr = Base64.getEncoder().encodeToString(nat);
    System.out.println("encodedStr--->" + encodedStr);
    for (byte b : encoded) {
      System.out.println(b);
    }

    System.out.println("decoded---->");
    byte[] decoded = Base64.getDecoder().decode(encoded);
    for (byte b : decoded) {
      System.out.println(b);
    }

    System.out.println("decoded string---->");
    byte[] decodedStr = Base64.getDecoder().decode(encodedStr);
    for (byte b : decodedStr) {
      System.out.println(b);
    }
  }

}
