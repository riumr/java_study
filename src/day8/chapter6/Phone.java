package day8.chapter6;

// protected 필드가 있는 객체
public class Phone {
  protected String owner;

  void talk() {
    System.out.println(owner+"가 통화 중");
  }

  public Phone(String owner) {
    this.owner = owner;
  }

  public Phone() {

  }
}
