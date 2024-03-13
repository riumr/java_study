package day7.chapter6;

// 상속관계 확인
public class ClassExtendsDemo {
  public static void main(String[] args) {
    Circle circle = new Circle();

    circle.findArea();
    circle.findRadius();

    Ball ball = new Ball("파랑");

    System.out.println(ball.color);
    ball.findColor();
    ball.findArea();
    ball.findVolume();
    ball.findRadius();
  }
}
