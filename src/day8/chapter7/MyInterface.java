package day8.chapter7;

public interface MyInterface {
  int max = 10; // public static final int
  void sayHello(); // public abstract
}

class Hello implements MyInterface{

  @Override // interface의 추상 메소드를 override 해야한다.
  public void sayHello() {
    System.out.println("Hello");
  }
}