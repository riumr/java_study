package day9.chapter7;

// 인터페이스로 타입변환
public interface Movable {
  void move(int d);
}

class Car implements Movable{
  private int position;
  @Override
  public void move(int d) {
    position+=d;
    System.out.println("자동차는 ? 거리만큼 이동한다");
  }

  public void show(){
    System.out.println(position+"m 이동했습니다");
  }
}