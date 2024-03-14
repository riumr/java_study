package day7.chapter6;

// 다형성 실습
public class PolyDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Employee e = new Employee();
    Person p = s; // 자동형변환, 업캐스팅
    System.out.println(p.name); // 부모 생성자로 형변환하면 부모 요소의 멤버만 사용할 수 있다.
    p.whoami();
    check(s);
    check(p);
    check(e);

    Person person = new Person();

    Person[] people = new Person[3];
    people[0] = person;
    people[1] = s;
    people[2] = e;
  }
  static void check(Person p){ // 부모 생성자를 매겨변수로 가지는 메서드에서 사용될 수 있다 : 다형성이 존재하는 이유
    System.out.println(p.name);
  }
}
