package day3.chapter4;

public class Bird extends Animal {
  @Override
  void move() {
    System.out.println("난다");;
  }

  @Override
  void eat() {
    System.out.println("벌레를 먹는다.");
  }

  // 필드
//  int legs = 2;
  int wings = 2;
  // 메서드
//  void eat(){
//    System.out.println("벌레를 먹는다.");
//  }
//  void move(){
//    System.out.println("난다.");
//  }
}
