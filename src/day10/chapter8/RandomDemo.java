package day10.chapter8;

import java.util.Random;

// Random 클래스
public class RandomDemo {
  public static void main(String[] args) {
    Random r = new Random();
    for (int i = 0; i <10; i++) {
      System.out.println(r.nextInt(1,7));
    }
  }
}
