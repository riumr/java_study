package day8.chapter6;

public class OverrideTest {
  public static void main(String[] args) {
    Car1 c = new Car1("파랑", 200, 1000, 5);
    c.show();

    System.out.println();
    Vehicle1 v = c;
    v.show(); // overriding 된 메서드의 다형성 관계 확인
  }
}
