package jcode.ch_01_java_core.q_54_strings;

public class String_01 {

  public static void main(String[] args) {
    String s = "String";
    System.out.println("hashCode--->" + s.hashCode());

    /**
     * public final class String
     *     implements java.io.Serializable, Comparable<String>, CharSequence {
     *
     * public int hashCode() {
     *         int h = hash;
     *         if (h == 0 && value.length > 0) {
     *             char val[] = value;
     *
     *             for (int i = 0; i < value.length; i++) {
     *                 h = 31 * h + val[i];
     *             }
     *             hash = h;
     *         }
     *         return h;
     *     }
     *
     */
  }
}

// Error!!!
// String is final class !!!
//class StringEx extends String {
//
//}
