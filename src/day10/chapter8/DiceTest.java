package day10.chapter8;

import java.util.Random;

// Random 클래스 사용 문제
public class DiceTest {
  public static void main(String[] args) {
    System.out.println(new Dice().roll());
  }
}

class Dice {
  int roll() {
    Random r = new Random();
    return r.nextInt(1, 7);
  }
}
