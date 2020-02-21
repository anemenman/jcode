package jcode.ch_01_java_core.q_39_clone;

public class Clone_02_Deep {

  public static void main(String[] args) throws CloneNotSupportedException {
    Deep deep = new Deep(new DD());
    Deep deep1 = (Deep) deep.clone();
    System.out.println(deep.equals(deep1));
    System.out.println(deep.getDD().equals(deep1.getDD()));
  }

}

class Deep implements Cloneable {

  DD dd;

  Deep(DD dd) {
    this.dd = dd;
  }

  void setDD(DD dd) {
    this.dd = dd;
  }

  DD getDD() {
    return dd;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    Deep deep = (Deep) super.clone();
    deep.setDD(new DD());
    return deep;
  }
}

class DD {

  int i;
}
