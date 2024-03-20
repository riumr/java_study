package day12.chapter11;

import java.util.Stack;

// collection 인터페이스 list 컬렉션 stack 클래스
public class StackDemo {
  public static void main(String[] args) {
    Stack<Integer> i1 = new Stack<>();

    System.out.println(i1.isEmpty());

    i1.push(1);
    i1.add(2);
    i1.add(1);
    i1.add(4);
    System.out.println(i1);
    System.out.println(i1.search(1));

  }
}
