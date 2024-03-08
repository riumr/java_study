package day4.chapter4;

public class CarDemo {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.setColor("black");
    car1.setDirection("front");

    System.out.println(car1.getDirection());

    Car car2 = new Car("back","white","ford");
    Car car3 = new Car("front","black","ford");
    car2.showCar();
    car3.showCar();
  }
}
