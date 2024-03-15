package day9.chapter7;

import java.util.Arrays;

// Array.sort() 내림차순
public class PersonTest {
  public static void main(String[] args) {
    Person[] p = {
        new Person(40,175,68,"박지성"),
        new Person(32,170,75,"홍길동"),
        new Person(20,180,70,"손흥민")
    };
    Arrays.sort(p);
    for (Person p1 : p) {
      System.out.println(p1);
    }
  }
}
