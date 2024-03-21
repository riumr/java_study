package day13.chapter12;

import java.util.Optional;

// 매칭과 검색. stream의 최종연산
public class MatchDemo {
  public static void main(String[] args) {
    // allMatch
    if(Nation.nations.stream().allMatch(d->d.getPopulation()>100.0)){
      System.out.println("모든 국가의 인구가 1억이 넘는다");
    } else {
      System.out.println("모든 국가의 인구가 1억이 넘지는 않는다.");
    }

    // 섬인 나라 중 하나 출력
    Optional<Nation> any = Nation.nations.stream().filter(Nation::isIsland).findAny();
    System.out.println(any);

    String name = any.get().getName();
    System.out.println(name);

    any.ifPresent(Util::print);
    System.out.println();

    // 섬인 나라 중 처음 출력
    Optional<Nation> first = Nation.nations.stream().findFirst();
    System.out.println(first.get().getName());
  }
}
