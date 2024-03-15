package day9.chapter7;

// 추상 클래스 구현
abstract class Controller {
  boolean power;
  void show(){
    if(power){
      System.out.println(this.getName()+"가 켜졌습니다");
    } else{
      System.out.println(this.getName()+"가 꺼졌습니다");
    }
  }
  abstract String getName();

  public Controller(boolean power){
    this.power=power;
  }
}
