package jcode.ch_01_java_core.q_33_hashcode;

import org.apache.commons.codec.digest.DigestUtils;

public class HashCode_02_StrongImpl {

  public static void main(String[] args) {

    //org.apache.commons.codec.digest.DigestUtils.sha256Hex
    System.out.println(DigestUtils.sha256Hex("Aa"));
    System.out.println(DigestUtils.sha256Hex("BB"));

    System.out.println(DigestUtils.sha256Hex("AaAa"));
    System.out.println(DigestUtils.sha256Hex("BBBB"));
    System.out.println(DigestUtils.sha256Hex("AaBB"));
    System.out.println(DigestUtils.sha256Hex("BBAa"));
  }

}
