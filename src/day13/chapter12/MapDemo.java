package day13.chapter12;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b1", "c1", "c2", "c3");
    Stream<String> s2 = s1.map(String::toUpperCase);

    Stream<String> s3 = Stream.of("a1", "b2", "c3");
    s3.map(s -> s.substring(1)).
        map(x -> Integer.parseInt(x)).
        map(i -> i * i).
        forEach(Util::print);
  }
}
