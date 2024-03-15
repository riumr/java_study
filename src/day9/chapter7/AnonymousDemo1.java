package day9.chapter7;

// 중첩 클래스 구현
public class AnonymousDemo1 {
  private class Eagle implements Bird{
    @Override
    public void move() {
      System.out.println("독수리가 난다");
    }

    void sound(){
      System.out.println("나는 소리");
    }
  }

  Eagle e = new Eagle();

  public static void main(String[] args) {
    AnonymousDemo1 a = new AnonymousDemo1();
    a.e.move();
    a.e.sound();;
  }
}
