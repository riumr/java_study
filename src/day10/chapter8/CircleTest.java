package day10.chapter8;

// equals 메소드 overridng 문제
public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(3);
    Circle c2 = new Circle(3);

    if (c1.equals(c2)) {
      System.out.println("c1과 c2는 같다");
    } else {
      System.out.println("c1과 c2는 다르다");
    }
  }
}

class Circle {
  int radius;

  public Circle(int radisu) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof Circle c ? this.radius == c.radius : false;

  }
}