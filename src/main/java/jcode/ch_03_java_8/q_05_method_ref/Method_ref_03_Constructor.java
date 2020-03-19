package jcode.ch_03_java_8.q_05_method_ref;

public class Method_ref_03_Constructor {

  public static void main(String[] args) {
    Messageable hello = Message::new;
    hello.getMessage("Hello");
  }

}

@FunctionalInterface
interface Messageable {

  Message getMessage(String msg);
}

class Message {

  Message(String msg) {
    System.out.print(msg);
  }
}
