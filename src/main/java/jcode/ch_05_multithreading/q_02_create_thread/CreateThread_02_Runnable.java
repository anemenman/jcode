package jcode.ch_05_multithreading.q_02_create_thread;

public class CreateThread_02_Runnable {

  public static void main(String[] args) {
    Runnable1 runnable1 = new Runnable1();
    Thread thread = new Thread(runnable1);
    thread.start();
  }
}

class Runnable1 implements Runnable {

  @Override
  public void run() {
    System.out.println("Runnable1 is running...");
  }
}
