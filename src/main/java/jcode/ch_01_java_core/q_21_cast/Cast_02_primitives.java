package jcode.ch_01_java_core.q_21_cast;

public class Cast_02_primitives {

  public static void main(String[] args) {

    byte b = 1;

    //Autocast Should be OK!
    castByte(b);
    castDouble(b);

    double d = 0.231232431431513454351435154354365657681;
    castDouble(d);
    castByte((byte) d);//cast to byte

  }

  public static void castDouble(double d) {
    System.out.println("castDouble--->" + d);
  }

  public static void castByte(byte b) {
    System.out.println("castByte---->" + b);
  }
}
