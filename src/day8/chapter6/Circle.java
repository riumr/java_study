package day8.chapter6;

// Object 객체 overriding
public class Circle {
  public int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public void show() {
    System.out.println("반지름이 " + radius + "인 원이다.");
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      Circle c = (Circle) obj;
      return this.radius == c.radius;
    }
    return false;
  }

  public Circle() {
  }

}
