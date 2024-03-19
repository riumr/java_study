package day11.chapter9;

import java.util.Random;

// 예외처리
public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    Random r = new Random();
    try {
      for (int i = 0; i < 10; i++) {
        int number = r.nextInt(10);
        int result = 10 / number;
      }
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try-catch 프로그램 종료");
    }
    System.out.println("프로그램 종료");
  }
}
