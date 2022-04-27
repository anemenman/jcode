package jcode.ch_05_multithreading.q_20_thead_uncaught_exception;

public class ThreadUncaughtException_01 {
    public static void main(String[] args) {
        try {
            Thread2 thread1 = new Thread2();
            thread1.start();

            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Next...");
    }
}

class Thread2 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
        throw new RuntimeException("Exception in Thread2");//Thread.UncaughtExceptionHandler - обработчик не пойманных исключений
    }
}
