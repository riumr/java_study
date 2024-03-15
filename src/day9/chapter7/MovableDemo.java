package day9.chapter7;

// 인터페이스로 형변환 확인
public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(5);
    Car c1 = (Car)m;
    c1.show();

    Car c = new Car();
    c.move(5);
    c.move(12);
    c.move(11);
    c.show();
  }
}
