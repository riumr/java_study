package day13.chapter12;

import java.util.Comparator;
import java.util.stream.Stream;

// stream 정렬 예제
public class SortedDemo {
  public static void main(String[] args) {
    Stream<Nation> n1 = Nation.nations.stream();
    Stream<Nation> sorted = n1.sorted(Comparator.comparing(Nation::getGdpRank));
    sorted.map(x->x.getName()+" "+x.getGdpRank()).forEach(Util::print);
    System.out.println();

    // 인구 많은 나라 순으로 출력하기(나라이름,인구)
    Stream<Nation> n2 = Nation.nations.stream();
    Stream<Nation> sorted2 = n2.sorted(Comparator.comparing(Nation::getPopulation).reversed());
    sorted2.map(x->x.getName()+" "+x.getPopulation()).forEach(Util::print);
  }
}
