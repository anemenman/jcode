package jcode.ch_02_collections.q_62_references;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class Ref_04_PhantomReference {

  public static void main(String[] args) {
    A a = new A();
    ReferenceQueue<A> queue = new ReferenceQueue<A>();
    PhantomReference<A> phantomReference = new PhantomReference<>(a, queue);
  }
}

class A {

}
