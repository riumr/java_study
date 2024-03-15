package day9.chapter7;

// 인터페이스로 타입변환. 구현 클래스 내 메소드 오버라이딩
public interface Animal {
  void sound();
}

class Dog implements Animal{
  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}

class Cukcoo implements Animal {
  @Override
  public void sound() {
    System.out.println("뻐국");
  }
}