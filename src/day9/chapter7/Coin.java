package day9.chapter7;

public interface Coin {
  int PENNY=1, NICKEL=5,DIME=10,QUARTER=25;
}

class CoinDemo {
  public static void main(String[] args) {
    System.out.println("Dime은"+Coin.DIME+"센트입니다."); // 인터페이스를 호출하는 방식으로도 변수를 가져올 수 있다.
    System.out.println("Penny는"+Coin.PENNY+"센트입니다.");
  }
}
