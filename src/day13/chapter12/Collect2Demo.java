package day13.chapter12;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Collector 연산. 수집 및 요약
public class Collect2Demo {
  public static void main(String[] args) {
    Stream<Nation> s1 = Nation.nations.stream();
    List<String> slist = s1.map(Nation::getName).collect(Collectors.toList());
    System.out.println(slist);

    Stream<Nation> s2 = Nation.nations.stream();
    Set<Nation.Type> sset = s2.map(Nation::getType).collect(Collectors.toSet());
    System.out.println(sset);

    Stream<Nation> s3 = Nation.nations.stream();
    Map<String,Double> sMap = s3.collect(Collectors.toMap(Nation::getName,Nation::getPopulation));
    System.out.println(sMap
    );
  }
}
