package day9.chapter7;

// 인터페이스 구현 객체 확인
public class ControllableDemo {
  public static void main(String[] args) {
    TV tv = new TV();
    Computer com = new Computer();

    tv.turnOn();
    tv.turnOff();
    tv.repair();
    Controllable.reset();

    com.turnOn();
    com.turnOff();
  }
}
