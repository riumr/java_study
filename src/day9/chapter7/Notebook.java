package day9.chapter7;

// class를 상속하고 interface를 구현한 객체
public class Notebook extends Computer implements Portable{
  @Override
  public void inMyBag() {
    System.out.println("노트북은 가방안에 있다");
  }

  @Override
  public void turnOn() {
    System.out.println("노트북을 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("노트북을 끈다");
  }

  public static void main(String[] args) {
    Notebook notebook = new Notebook();
    notebook.inMyBag();
    notebook.turnOn();
    notebook.turnOff();
  }
}
