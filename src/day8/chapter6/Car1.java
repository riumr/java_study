package day8.chapter6;

public class Car1 extends Vehicle1{
  int displacement;
  int gars;

  @Override
  void show(){
    System.out.println(color+" 자동차이고"+" 속도는 "+speed+" 출발은 "+displacement+" 가스는 "+gars+"만큼 들어있습니다");
  }

  public Car1(String color, int speed,int displacement,int gars){
    super(color,speed);
    this.displacement=displacement;
    this.gars=gars;
  }
}
