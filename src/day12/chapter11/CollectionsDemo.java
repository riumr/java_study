package day12.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Collections 클래스
// sort, reverse, shuffle 등
public class CollectionsDemo {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("a","b","d","c");

    // sort
    System.out.println(list);
    Collections.sort(list,(a,b)->b.compareTo(a));
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);

    List<Character> cList = new ArrayList<>();
    for (char c = 'A'; c <='G' ; c++) {
      cList.add(c);
    }
    // rotate
    System.out.println("list : "+cList);
    Collections.rotate(cList,3);
    System.out.println(cList);
    // shuffle
    Collections.shuffle(cList);
    System.out.println(cList);
    // binarySearch
    Collections.sort(cList);
    System.out.println(Collections.binarySearch(cList,'C'));
  }
}
