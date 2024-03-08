package day4.chapter4;

public class Car {
  // 일련번호, 방향, 색깔
  private long serial;
  private String direction;
  private String color;
  private String carType;
  private static long sequence;

  String getDirection(){
    return this.direction;
  }

  void setDirection(String direction){
    this.direction=direction;
  }

  void setColor(String color){
    this.color=color;
  }

  void setCarType(String carType){
    this.carType=carType;
  }

  Car(String direction, String color, String carType){
    sequence++;
    this.serial=sequence;
    this.direction=direction;
    this.color=color;
    this.carType=carType;
  }

  Car(){}

  void showCar(){
    System.out.printf("시리얼 번호 %d 방향 %s 색깔 %s 차종 %s\n",serial,direction,color,carType);
  }
}
