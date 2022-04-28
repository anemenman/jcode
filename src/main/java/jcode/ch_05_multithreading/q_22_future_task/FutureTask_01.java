package jcode.ch_05_multithreading.q_22_future_task;

import java.util.concurrent.*;

public class FutureTask_01 {
    public static void main(String[] args) {
        MyCallable callable1 = new MyCallable(1000);
        MyCallable callable2 = new MyCallable(2000);

        // создаем 2 future таска для 2х callable объектов
        FutureTask<String> futureTask1 = new FutureTask<>(callable1);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);

        // екзекьютор с размером пула в 2 потока
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // стартуем
        executor.execute(futureTask1);
        executor.execute(futureTask2);

        // выполняем в бесконечном цикле, пока
        // executor service не закончит выполнение всех future тасков
        while (true) {
            try {
                if (futureTask1.isDone() && futureTask2.isDone()) {
                    System.out.println("Done");
                    // заканчиваем работу executor service
                    executor.shutdown();
                    return;
                }

                if (!futureTask1.isDone()) {
                    // ждем, пока future task не закончит выполнение
                    System.out.println("Результат выполнения FutureTask1 = " + futureTask1.get());
                }

                System.out.println("Ждем, пока FutureTask2 не закончит свое выполнение");
                String s = futureTask2.get(200L, TimeUnit.MILLISECONDS);
                if (s != null) {
                    System.out.println("Результат выполнения FutureTask2 = " + s);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                //оставим пустым
            }
        }
    }
}

class MyCallable implements Callable<String> {

    private long waitTime;

    public MyCallable(int timeInMillis) {
        this.waitTime = timeInMillis;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        // возвращает имя потока, который выполняет этот callable таск
        return Thread.currentThread().getName();
    }

}