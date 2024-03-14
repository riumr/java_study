package day8.chapter6;

// 상속 시 멤버 변화 확인
public class OverTypeDemo {
  public static void main(String[] args) {
    Vehicle v = new Car();
    System.out.println(v.name);
    v.whoami();
    v.move();
  }
}
