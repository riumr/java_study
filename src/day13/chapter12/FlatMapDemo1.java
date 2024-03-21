package day13.chapter12;

import java.util.stream.Stream;

public class FlatMapDemo1 {
  public static void main(String[] args) {
    Stream<Nation> n1 = Nation.nations.stream();
    Stream<String> s1 = n1.map(Nation::getName);
    s1.limit(4).forEach(Util::printWithParenthesis);

    System.out.println("\n모든 나라의 gdpRank를 출력하기");
    Stream<Nation> n2 = Nation.nations.stream();
    n2.map(Nation::getGdpRank).forEach(Util::print);
  }
}
