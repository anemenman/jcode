package jcode.ch_02_collections.q_62_references;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Ref_03_WeakReference {

  public static void main(String[] args) {
    W w = new W();
    ReferenceQueue<W> queue = new ReferenceQueue<>();
    WeakReference<W> weakReference = new WeakReference<>(w, queue);
  }

}

class W {

}
