package day3.chapter4;

// instance 생성. 메서드 호출.
public class ParentChildDemo {
  public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    a1.move();
    a2.move();

    a1.eat();
    a2.eat();

    Tiger t1 = new Tiger();
    t1.move();
    t1.eat();

    Bird b1 = new Bird();
    b1.move();
    b1.eat();
  }
}
