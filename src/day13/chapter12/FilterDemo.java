package day13.chapter12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// fiter() 메소드와 함께 사용하는 메소드들
public class FilterDemo {
  public static void main(String[] args) {
    // skip
    Stream.of("a1","b1","b2","c1","c2","c3")
        .filter(s->{
          System.out.println(s);
          return s.startsWith("c");
        })
        .skip(1).forEach(Util::printWithParenthesisLn);

    // distinct
    IntStream i1 = IntStream.of(1, 2, 1, 3, 3, 2, 4);
    IntStream i2 = i1.filter(i->i%2==0);
    IntStream i3 = i2.distinct();
    i3.forEach(Util::print);

    // limit
    System.out.print("\n인구가 1억(100백만) 이상의 2개 나라 : ");
    Stream<Nation> n1 = Nation.nations.stream();
    n1.filter(p->p.getPopulation()>100.0).limit(2).forEach(Util::printWithParenthesis);

  }
}
