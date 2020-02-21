package jcode.ch_01_java_core.q_39_clone;

public class Clone_03_FinalFields {

  public static void main(String[] args) throws CloneNotSupportedException {
    F f = new F(31, new O());
    F f2 = (F) f.clone();
    System.out.println("f.equals(f2)---->" + f.equals(f2));
    System.out.println("f2.getF()--->" + f2.getF());
    System.out.println("f---->" + f.getO());
    System.out.println("f2--->" + f2.getO());
    System.out.println("f.getO().equals(f2.getO()--->" + f.getO().equals(f2.getO()));//Equals!!!
  }

}

class F extends FF implements Cloneable {

  final int i = 123;

  final int f;

  final O o;

  F(int f, O o) {
    this.f = f;
    this.o = o;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  int getI() {
    return i;
  }

  int getF() {
    return f;
  }

  O getO() {
    return o;
  }
}

//FF has not clone override but inherited from Object!!!
class FF {

}

class O {

}
