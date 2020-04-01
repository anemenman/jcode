package jcode.ch_03_java_8.q_57_stream;

import java.util.Random;

public class Stream_03_forEach_random {

  public static void main(String[] args) {
    Random random = new Random();
    System.out.println("for min int...max int");
    random.ints().limit(10).forEach(System.out::println);

    System.out.println("for 0..10");
    random.ints(10, 0, 10).limit(10).forEach(System.out::println);
  }

}
