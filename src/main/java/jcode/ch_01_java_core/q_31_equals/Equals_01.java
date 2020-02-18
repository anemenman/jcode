package jcode.ch_01_java_core.q_31_equals;

public class Equals_01 {

  private float f;
  private double d;

  /**
   * Correct override equals
   *
   * @param o
   * @return
   */
  @Override
  public boolean equals(Object o) {

    //1)
    if (this == o) {
      return true;
    }

    //2)
    if (o == null) {
      return false;
    }

    //3)
    if (getClass() != o.getClass()) {
      return false;
    }

    Equals_01 equals_01 = (Equals_01) o;
    //4) Compare all fields
    if (Float.floatToIntBits(f) != Float.floatToIntBits((equals_01.f))) {
      return false;
    }
    if (Double.doubleToLongBits(d) != Double.doubleToLongBits(equals_01.d)) {
      return false;
    }
    //5)...for collections check all field of element

    //6) Always override hashCode()

    return false;
  }

  public static void main(String[] args) {
    Equals_01 e1 = new Equals_01();
    e1.equals(new Integer(10));
    e1.equals(new Equals_01());
  }

}
