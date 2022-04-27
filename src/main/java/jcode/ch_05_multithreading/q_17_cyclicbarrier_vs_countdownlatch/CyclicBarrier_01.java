package jcode.ch_05_multithreading.q_17_cyclicbarrier_vs_countdownlatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_01 {
    public static void main(String[] args) {
        //Создание барьера с ожиданием 5 потоков и
        //потоком Action который будет выполнен при снятии барьера
        CyclicBarrier cb = new CyclicBarrier(5, new Action());

        System.out.println("Старт потоков!");

        //Запуск потоков
        new CustomThread1(cb, "Поток a");
        new CustomThread1(cb, "Поток b");
        new CustomThread1(cb, "Поток c");
        new CustomThread1(cb, "Поток d");
        new CustomThread1(cb, "Поток e");
    }
}

//Реализация потоков, которые будут ждать снятия барьера
class CustomThread1 implements Runnable {
    final private CyclicBarrier cb;
    final private String message;

    CustomThread1(CyclicBarrier cb, String message) {
        this.cb = cb;
        this.message = message;
        //Старт потока
        new Thread(this).start();
    }

    public void run() {
        System.out.println(this.message);
        try {
            //Ожидание потоком снятия барьера
            this.cb.await();
        } catch (BrokenBarrierException | InterruptedException ex) {
            System.out.println(ex);
        }
    }
}

//Поток который будет запущен при снятии барьера
class Action implements Runnable {
    public void run() {
        System.out.println("Барьер снят!");
    }
}
