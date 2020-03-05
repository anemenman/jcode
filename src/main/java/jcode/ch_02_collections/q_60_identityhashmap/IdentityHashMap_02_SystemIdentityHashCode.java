package jcode.ch_02_collections.q_60_identityhashmap;

public class IdentityHashMap_02_SystemIdentityHashCode {

  public static void main(String[] args) {
    Object object1 = new Object();
    Object object2 = new Object();

    //public static native int identityHashCode(Object x);
    //Returns the same hash code for the given object as
    //     * would be returned by the default method hashCode(),
    System.out.println("System.identityHashCode(object1)--->" + System.identityHashCode(object1));
    System.out.println("System.identityHashCode(object2)--->" + System.identityHashCode(object2));
    System.out.println("object1.hashCode()--->" + object1.hashCode());
    System.out.println("object2.hashCode()--->" + object2.hashCode());
  }

}
