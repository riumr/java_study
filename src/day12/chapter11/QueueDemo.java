package day12.chapter11;

import java.util.LinkedList;
import java.util.Queue;

// collection 인터페이스 queue 컬렉션
public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    System.out.println(q.size());
    q.offer("apple");
    q.offer("banana");
    q.offer("cherry");
    System.out.println(q);

    while (!q.isEmpty()){
      System.out.println(q.poll());
    }
  }
}
