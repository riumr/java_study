package day10.chapter8;

// Generic 타입을 사용하지 않은 경우
public class GenericClassDemo1 {
  public static void main(String[] args) {
    Cup c = new Cup();

    c.setBeverage(new day10.chapter8.generic.Beer());
    Object beverage = c.getBeverage();
    if(beverage instanceof day10.chapter8.generic.Beer){
      day10.chapter8.generic.Beer b = (day10.chapter8.generic.Beer)beverage;
    }
    c.setBeverage(new day10.chapter8.generic.Boricha());
    Object beverage1 = c.getBeverage();
    if(beverage1 instanceof day10.chapter8.generic.Beer){
      day10.chapter8.generic.Boricha br = (day10.chapter8.generic.Boricha) beverage1;
    }
  }
}

class Beverage {

}

class Beer extends day10.chapter8.generic.Beverage {

}

class Boricha extends day10.chapter8.generic.Beverage {

}

class Cup {
  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}
