package day9.chapter7;

// 인터페이스 구현 클래스들 작동 확인
public class HumanTest {
  public static void main(String[] args) {
    Human.echo();
    Student s = new Student(20);
    s.print();
    s.eat();

    Human p = new Worker();
    p.print();
    p.eat();
  }
}
