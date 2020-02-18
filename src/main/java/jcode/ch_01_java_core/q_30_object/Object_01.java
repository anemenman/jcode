package jcode.ch_01_java_core.q_30_object;

public class Object_01 {

  public static void main(String[] args) {
    Object o;

    /**
     * Class java.lang.Object
     *
     * STATIC:
     * private static native void registerNatives();
     *     static {
     *         registerNatives();
     *     }
     *
     * NON-STATIC:
     * 1) public final native Class<?> getClass();
     * 2) public native int hashCode();
     * 3) public boolean equals(Object obj) {return (this == obj);}
     * 4) protected native Object clone() throws CloneNotSupportedException;
     * 5) public String toString() {
     *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
     *     }
     * 6) public final native void notify();
     * 7) public final native void notifyAll();
     * 8) public final native void wait(long timeout) throws InterruptedException;
     * 9) public final void wait(long timeout, int nanos) throws InterruptedException
     * 10) public final void wait() throws InterruptedException {wait(0);}
     * 11) protected void finalize() throws Throwable { }
     *
     */
  }

}
