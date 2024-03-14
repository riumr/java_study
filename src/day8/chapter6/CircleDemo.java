package day8.chapter6;

public class CircleDemo {
  public static void main(String[] args) {
    Circle c = new Circle(5);
    ColoredCircle cc = new ColoredCircle(5, "빨간색");
    c.show();
    cc.show();
  }
}
