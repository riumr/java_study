package day13.chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// flatMap 메소드 사용 예제
public class FlatMapDemo2 {
  public static void main(String[] args) {
    List<String> list1 = List.of("안녕, 자바!", "잘 가 C++!");
    Stream<String> s1 = list1.stream();
    Stream<String> s2 = s1.flatMap(s-> Arrays.stream(s.split(" ")));
    s2.forEach(Util::printWithParenthesis);
    System.out.println();

    List<String> l1 = List.of("Good Morning");
    List<String> l2 = List.of("hello World","welcome, stream");

    Stream<List<String>> sList1 = Stream.of(list1,l1,l2);
    sList1.flatMap(list -> {
      if(list.size()>1){
        return list.stream();
      }
      else {
        Stream.empty();
      }
      return null;
    }).forEach(Util::printWithParenthesis);
  }
}
