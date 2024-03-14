package day8.chapter7;

// Interface 상속받은 객체 확인
public class InterfaceDemo {
  public static void main(String[] args) {
    Hello hello = new Hello();
    hello.sayHello();
    System.out.println(hello.max);
  }
}
