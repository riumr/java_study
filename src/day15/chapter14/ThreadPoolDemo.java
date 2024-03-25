package day15.chapter14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// ThreadPool
public class ThreadPoolDemo {
  public static void main(String[] args) {
    Runnable task = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("good bye"+i);
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    };
    ExecutorService thPool = Executors.newFixedThreadPool(2);
    thPool.execute(task);

    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
    thPool.shutdown();
  }
}
