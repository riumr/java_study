package day9.chapter7;

// 익명 클래스. 일시적으로 overiding해 사용할 클래스
public class AnonymousDemo2 {
  Bird e = new Bird() {
    @Override
    public void move() {
      System.out.println("독수리가 난다");
    }
    void sound(){
      System.out.println("나는 소리");
    }
  };

  public static void main(String[] args) {
    AnonymousDemo2 a = new AnonymousDemo2();
    a.e.move();
  }
}
