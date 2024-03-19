package day11.chapter10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// lambda식으로 함수형 interface 메소드 사용
public class lambdaDemo2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(5,3,2,9);
    Collections.sort(list);
    System.out.println(list);
    Collections.sort(list,((o1, o2) ->o2-o1));
    System.out.println(list);

    List<String> list2 = Arrays.asList("d","a","b","c");
    Collections.sort(list2);
    System.out.println(list2);
    Collections.sort(list2,((o1, o2) -> o2.compareTo(o1)));
    System.out.println(list2);
  }
}
