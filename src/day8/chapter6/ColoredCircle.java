package day8.chapter6;

public class ColoredCircle extends Circle{
  String color;

  @Override
  public void show() {
    System.out.println("반지름이 "+radius+"인 "+color+"원이다");
  }

  public ColoredCircle(int radius, String color) {
    super(radius); // 부모의 필드값 호출
    this.color=color;
  }

}
