package day9.chapter7;

// 인터페이스로 upcasting후 메소드 실행
public class TalkableTest {
  static void speak(Talkable talkable){
    talkable.talk();
  }

  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }
}

class Korean implements Talkable{

  @Override
  public void talk() {
    System.out.println("안녕하세요");
  }
}

class American implements Talkable{
  @Override
  public void talk() {
    System.out.println("Hello");
  }
}