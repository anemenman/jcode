package jcode.ch_05_multithreading.q_02_create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CreateThread_03_Callable {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    Callable callable = new Callable1(5);
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    Future<Integer> future = executorService.submit(callable);
    System.out.println(future.get().intValue());
    executorService.shutdown();
  }

}

class Callable1 implements Callable<Integer> {

  int number;

  public Callable1(int number) {
    this.number = number;
  }

  @Override
  public Integer call() throws Exception {
    int fact = 1;

    for (int count = number; count > 1; count--) {
      fact = fact * count;
    }

    return fact;
  }
}
