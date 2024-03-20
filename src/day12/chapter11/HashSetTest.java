package day12.chapter11;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김", 20));
    set.add(new Person("최", 56));
    set.add(new Person("우", 16));
    set.add(new Person("나", 23));
    for (Person person : set) {
      System.out.println(person);
    }
    System.out.println(set);
  }
}

class Person {
  String name;
  int age;


  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person p) {
      return this.name.equals(p.name);
    }
    return false;
  }

  @Override
  public String toString() {
    return "이름 :" + name + " 나이:" + age;
  }
}