package jcode.ch_05_multithreading.q_35_read_write_lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

import static jcode.ch_05_multithreading.q_35_read_write_lock.ReadWriteLock_01.LOCK;
import static jcode.ch_05_multithreading.q_35_read_write_lock.ReadWriteLock_01.MESSAGE;

public class ReadWriteLock_01 {

    public static final ReentrantReadWriteLock LOCK = new ReentrantReadWriteLock(true);

    public static String MESSAGE = "a";

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new WriterA());
        t1.setName("Writer A");

        Thread t2 = new Thread(new WriterB());
        t2.setName("Writer B");

        Thread t3 = new Thread(new Reader());
        t3.setName("Reader");
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
    }
}

class Reader implements Runnable {

    public void run() {

        if (LOCK.isWriteLocked()) {
            System.out.println("Write Lock Present.");
        }
        LOCK.readLock().lock();

        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + "  Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + ": " + MESSAGE);
            LOCK.readLock().unlock();
        }
    }
}

class WriterA implements Runnable {

    public void run() {
        LOCK.writeLock().lock();

        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + "  Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            MESSAGE = MESSAGE.concat("a");
            LOCK.writeLock().unlock();
        }
    }
}

class WriterB implements Runnable {

    public void run() {
        LOCK.writeLock().lock();

        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + "  Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            MESSAGE = MESSAGE.concat("b");
            LOCK.writeLock().unlock();
        }
    }
}
