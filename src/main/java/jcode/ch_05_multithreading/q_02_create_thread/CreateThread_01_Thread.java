package jcode.ch_05_multithreading.q_02_create_thread;

public class CreateThread_01_Thread {

  public static void main(String[] args) {
    Thread1 thread1 = new Thread1();
    thread1.start();
  }
}

class Thread1 extends Thread {

  @Override
  public void run() {
    System.out.println("Thread is running...");
  }
}
