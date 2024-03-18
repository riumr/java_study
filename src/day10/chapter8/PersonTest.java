package day10.chapter8;

// equals 메소드 overriding 문제
public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("11111","홍길동");
    Person p2 = new Person("11111","손흥민");

    if (p1.equals(p2)) {
      System.out.println("같은 사람이다");
    } else {
      System.out.println("다른 사람이다");
    }
  }
}

class Person {
  String id;
  String name;

  public Person(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Person p) {
      return (this.id.equals(p.id)) && (this.name.equals(p.name));
    }
    return false;
  }
}