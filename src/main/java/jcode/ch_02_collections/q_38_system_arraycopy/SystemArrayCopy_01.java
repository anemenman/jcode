package jcode.ch_02_collections.q_38_system_arraycopy;

public class SystemArrayCopy_01 {

  public static void main(String[] args) {

    //public static native void arraycopy(Object src,  int  srcPos,
    //                                        Object dest, int destPos,
    //                                        int length);
    System.arraycopy(new int[1], 0, new int[1], 0, 1);
  }

}
