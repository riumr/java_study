package day12.chapter11;

import java.util.ArrayList;
import java.util.List;

// Collection 인터페이스 List 컬렉션(List.of)
// ArrayList 와 동일한 기능을 제공하지만 스레드에 안전하다
public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> l = List.of("a","bc","def");

    List<String> list = new ArrayList<>(l);
    System.out.println(list.size());

    list.add("abcd");
    list.forEach(System.out::print);
    System.out.println();

    list.remove("a");
    System.out.print(list);

    list.removeIf(s -> s.length()==3);
    System.out.println(list);

  }
}
