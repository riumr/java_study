package day8.chapter6;

public class OverrideTest {
  public static void main(String[] args) {
    Car1 c = new Car1("파랑", 200, 1000, 5);
    c.show();

    System.out.println();
    Vehicle1 v = c;
    v.show(); // overriding 된 메서드로 만든 객체는 overcasting 된 객체에서도 호출 가능
  }
}
