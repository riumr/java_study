package day12.chapter11;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Collection 인터페이스 Iterator 메소드. 반복용 객체 생성
public class IteratorDemo {
  public static void main(String[] args) {
    Collection<String> list = Arrays.asList("a","b","c");

    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.print(iterator.next()+"-");
    }
    System.out.println();

    iterator = list.iterator();
    while (iterator.hasNext()){
      System.out.print(iterator.next()+"+");
    }
    System.out.println();
  }
}
