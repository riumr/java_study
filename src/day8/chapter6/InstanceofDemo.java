package day8.chapter6;

import day7.chapter6.Employee;
import day7.chapter6.Person;
import day7.chapter6.Student;

// instance의 type 확인. Downcasting
public class InstanceofDemo {
  public static void main(String[] args) {
    Person p = new Person();
    Student s = new Student();
    Employee e = new Employee();
    System.out.println(p.name);
    p.whoami();
    System.out.println(p instanceof Person);
    System.out.println(p instanceof Object);
    System.out.println(p instanceof Student);

    System.out.println(s instanceof Student);
    System.out.println(p instanceof Person);
    System.out.println(s instanceof Object);

    downcast(p); // 부모요소를 자식요소로 downcasting 할 수는 없다
    downcast(s); // 부모 객체형으로 upcasting 된 자식요소만 downcasting 할 수 있다
    downcast(e);
  }

  static void downcast(Person p) {
    if (p instanceof Student) {
      Student s = (Student) p;
      System.out.println("downcasting 성공");
    } else if (p instanceof Employee) {
      Employee e = (Employee) p;
      System.out.println("downcasting 성공");
    } else {
      System.out.println("downcasting 종료");
    }
  }
}

