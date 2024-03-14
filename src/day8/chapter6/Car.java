package day8.chapter6;

// 자식객체
public class Car extends Vehicle{
  String name = "자동차";

  void whoami(){
    System.out.println("나는 자동차이다");
  }

  static void move(){
    System.out.println("달리다");
  }
}
