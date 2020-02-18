package jcode.ch_01_java_core.q_27_generics;

public class Generics_02_Interface {

  public static void main(String[] args) {
    I2<String, Integer> i2 = new I2Impl<>();
    i2.i2("a", 5);
  }

}

interface I<T> {

  T i(T t);
}

interface I2<U, K> {

  void i2(U u, K k);
}

class I2Impl<U, K> implements I2<U, K> {

  @Override
  public void i2(U u, K k) {
    System.out.println("U class is" + u.getClass());
    System.out.println("K class is" + k.getClass());
  }
}
