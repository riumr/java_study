package day3.chapter4;

public class Tiger extends Animal{
  @Override
  void eat() {
    System.out.println("동물을 먹는다");
  }

  @Override // annotation
  void move() {
    System.out.println("호랑이 달린다.");
  }
  // 필드
//  private int legs = 4; // 필드 은닉
  // 메서드
//  void eat() {
//    System.out.println("동물을 먹는다.");
//  }
//
//  void move() {
//    System.out.println("달린다.");
//  }
}
