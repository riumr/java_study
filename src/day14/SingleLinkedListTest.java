package day14;

import java.util.LinkedList;

public class SingleLinkedListTest {
  public static void main(String[] args) {
    SingleLinkedList<Integer> s1 = new SingleLinkedList<>();
    System.out.println(s1.size());
    s1.addLast(10);
    s1.addLast(20);
    s1.addLast(30);
    System.out.println(s1.size());
    for (int i = 0; i < s1.size(); i++) {
      System.out.println(s1.get(i));
    }
    System.out.println(s1.remove()+" 가 삭제됨");
    System.out.println(s1.remove(2)+" 가 삭제됨");

    LinkedList<Integer> l1 = new LinkedList<>();
    System.out.println(l1.size());
    l1.add(10);
    l1.add(20);
    l1.add(30);
    l1.add(40);
    System.out.println(l1.size());
    System.out.println(l1.get(0));
    System.out.println(l1.remove());
  }
}
