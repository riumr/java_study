package day8.chapter7;

// 인터페이스의 필요성 : 상속될 객체에 필수/선택 메소드를 정의할 수 있다.
// 인터페이스 멤버는 접근제한자가 없으면 abstract가 기본이다
public interface MyInterface {
  int max = 10; // public static final int
  void sayHello(); // public abstract
  default void say(){
    System.out.println("say");
  }
}

class Hello implements MyInterface{
  @Override // interface의 추상 메소드를 override 해야한다.
  public void sayHello() {
    System.out.println("Hello");
  }
}

class GoodBye implements MyInterface{
  @Override
  public void sayHello() {
    System.out.println("Goodbye");
  }
}

class SaySomething implements MyInterface{
  @Override
  public void sayHello() {
    System.out.println("say hello");
  }

  @Override
  public void say() {

  }
}