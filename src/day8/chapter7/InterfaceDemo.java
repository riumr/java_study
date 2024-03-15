package day8.chapter7;

// Interface 구현한 객체 확인
public class InterfaceDemo {
  public static void main(String[] args) {
    Hello hello = new Hello();
    hello.sayHello();
    System.out.println(hello.max);

    GoodBye goodBye = new GoodBye();
    goodBye.sayHello();
    goodBye.say();

    SaySomething saySomething = new SaySomething();
    saySomething.say();
    saySomething.sayHello();
  }
}
