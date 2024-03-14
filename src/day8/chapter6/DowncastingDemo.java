package day8.chapter6;

import day7.chapter6.Employee;
import day7.chapter6.Person;
import day7.chapter6.Student;

// upcasting 된 객체 배열에 담기
public class DowncastingDemo {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    Person f = new Freelancer(); // 선언시 바로 upcasting 할 수도 있다
    Person s = new Student();
    Employee e = new Employee();
    people[0] = f;
    people[1] = s;
    people[2] = e; // 자식요소를 배열에 넣는 과정에서 upcasting(자동형변환) 된다.
    for (Person person : people) {
      if (person instanceof Student s1) { // 인스턴스 instanceof type 변수명 으로 지역변수를 바로 생성할 수 있다.
        System.out.println(s1.number);
        s1.work();
      }
      if (person instanceof Freelancer){
        System.out.println(((Freelancer) person).number);
        ((Freelancer) person).work();
      }
      if (person instanceof Employee){
        Employee e1 = (Employee) person; // 자식 객체로 다시 downcasting 후 자식객체의 멤버를 사용할 수 있다.
        System.out.println(e1.number);
        e1.work();
      }
    }
  }
}
