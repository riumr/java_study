package day13.chapter12;

import java.util.Random;
import java.util.stream.IntStream;

// 느긋한 연산. 요소를 요구하기 전까지 작업하지 않는다.
// 빅데이터, 무한 스트림에 사용할 수 있다.
public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);

    IntStream intStream1 = intStream.filter(i -> {
      System.out.println("filter "+i); // 출력하지 않는다
      return i % 2 == 0;
    });

    IntStream intStream2 = intStream1.map(x -> {
      System.out.println("map "+x); // 출력하지 않는다.
      return x * x;
    });

    intStream2.forEach(System.out::println); // 작업하지 않은 것을 한번에 한다.

    IntStream ints = new Random().ints(0, 10);
    ints.filter(i->{
      System.out.println("random "+i);
      return i%2==0;
    }).limit(5).forEach(System.out::println);
  }
}
