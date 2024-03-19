package day10.chapter8.generic;


public class GenericClassDemo2 {
  public static void main(String[] args) {
    Cup<Beer> c = new Cup();
    Cup<Boricha> c1 = new Cup();


    c.setBeverage(new Beer());
//    c.setBeverage(new Boricha()); // compile 오류 나타남
    Beer beverage = c.getBeverage();
    beverage.drink();
//    if(beverage instanceof Beer){ // 타입체크 및 타입변환 불필요
//      Beer b = (Beer)beverage;
//    }
    c1.setBeverage(new Boricha());
    Boricha berverage1 = c1.getBeverage();
    berverage1.drink();
  }
}

// Generic 객체로 추상화
class Cup<T> {
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}
