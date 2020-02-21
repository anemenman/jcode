package jcode.ch_01_java_core.q_33_hashcode;

public class HashCode_04_Return31 {

  public static void main(String[] args) {
    R r = new R();
    System.out.println(r.hashCode());
  }
}

class R {

  @Override
  public int hashCode() {

    /**
     * If the question is why exactly 31, then this is because the operation of multiplication
     * can be replaced by shift and subtraction to increase productivity: 31 * i == (i << 5) - i.
     * Modern virtual machines do this kind of optimization automatically
     *
     * https://bugs.java.com/bugdatabase/view_bug.do?bug_id=4045622
     *
     * "Effective Java" by Joshua Bloch
     */
    return 31;

  }
}
