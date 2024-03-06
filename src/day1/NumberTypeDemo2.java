package day1;

public class NumberTypeDemo2 {
  public static void main(String[] args) {
    final double PI = 3.14;
    double radius = 10.0;
    double area = radius * radius * PI;
    System.out.println("반지름이 " + radius + "인 원의 넓이는 "+area+"입니다.");

    byte b = 100;
    int i = 100;
    b = (byte) i;
    System.out.println(b);
  }
}
