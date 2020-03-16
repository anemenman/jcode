package jcode.ch_02_collections.q_62_references;

import java.lang.ref.SoftReference;

public class Ref_02_SoftReference {

  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    SoftReference<StringBuilder> softBuilder = new SoftReference<>(builder);
  }

}
