package day13.chapter12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// stream과 collections 사용 방식 비교
public class StreamDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r.nextInt(30));
    }

    // collections
    List<Integer> gt10 = new ArrayList<>();
    for (Integer i : list) {
      if (i > 10) {
        gt10.add(i);
      }
    }
    Collections.sort(gt10);
    System.out.println(gt10);

    // stream
    list.stream().filter(i -> i > 10).sorted().forEach(x -> System.out.print(x + " "));
  }
}
