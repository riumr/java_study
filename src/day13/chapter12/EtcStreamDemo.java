package day13.chapter12;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// stream을 생성하는 방법들 2
public class EtcStreamDemo {
  public static void main(String[] args) {
    IntStream iterate = IntStream.iterate(1, x -> x + 2);

    IntStream ints = new Random().ints(0, 10);
//    ints.forEach(System.out::println);

    Stream<Double> generate = Stream.generate(Math::random);

    IntStream range = IntStream.range(1, 5);
    range.forEach(System.out::println);
    IntStream intStream = IntStream.rangeClosed(1, 5);
    intStream.forEach(System.out::println);
  }
}
