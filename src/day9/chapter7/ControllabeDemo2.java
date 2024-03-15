package day9.chapter7;

// 인터페이스로 타입 변환
public class ControllabeDemo2 {
  public static void main(String[] args) {
    Controllable[] controllables = new Controllable[3];
    controllables[0] = new TV();
    controllables[1] = new Notebook();
    controllables[2] = new Computer();
    for (Controllable c : controllables) {
      c.turnOn(); // 자식 객체에서 overriding으로 바인딩되었기때문에 형변환 상태에서도 호출할 수 있다.
      c.turnOff();
      c.repair();
      if(c instanceof Notebook n){
        n.inMyBag();
      }
    }
  }
}
