package day11.chapter10;

import java.util.Comparator;

// lambda식으로 함수형 interface 메소드 사용
public class FunctionalInterfaceDemo {
  public static void main(String[] args) {
    Comparator<String> c1 = (o1,o2) -> o1.length()-o2.length();
    System.out.println(c1.compare("abc","def"));
  }
}
