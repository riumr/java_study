package day12.chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

// Collection 인터페이스 list 컬렉션 LinkedList 클래스
// ArrayList와 요소 값 추가 속도 비교
public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    l1.add(10);
    l1.add(20);

    System.out.println(l1.remove(0));
    System.out.println(l1.size());
    System.out.println(l1);
    System.out.println(l1.remove(0));
    System.out.println(l1.size());

    long startTime = System.nanoTime();
    for (int i = 0; i <100000; i++) {
      l1.addFirst(i);
    }
    long endTime = System.nanoTime();
    long duration = endTime-startTime;
    System.out.println("LinkedList : "+duration);

    // ArrayList
    ArrayList<Integer> a1 = new ArrayList<>();
    startTime = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      a1.add(0,i);
    }
    endTime = System.nanoTime();
    duration = endTime-startTime;
    System.out.println("ArrayList : "+duration);
  }
}
