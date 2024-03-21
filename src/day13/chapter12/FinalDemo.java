package day13.chapter12;

import java.util.OptionalInt;
import java.util.stream.IntStream;

// stream 최종연산. 단순집계
public class FinalDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.of(5, 1, 2, 3);
    OptionalInt min = intStream.min();
    System.out.println(min.getAsInt());
    IntStream intStream2 = IntStream.of(5, 1, 2, 3);
    System.out.println(intStream2.count());
  }
}
