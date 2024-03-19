package day11.chapter9;

import day10.chapter8.generic.Beer;
import day10.chapter8.generic.Beverage;
import day10.chapter8.generic.Boricha;

import java.util.ArrayList;

// Generic type의 상속관계 확인.
// Generic 객체사이에는 상속관계가 있지만,
// Generic type 배열 사이에는 관계가 없다.
public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beverage> list = new ArrayList<Beverage>();
    System.out.println(list.size());
    list.add(new Beverage());
    list.add(new Beer());
    list.add(new Boricha());

    ArrayList<Beer> list1 = new ArrayList<Beer>();

    beverageTest(list);
//    beverageTest(list1);
  }
  private static void beverageTest(ArrayList<Beverage> list){
    Beverage beverage = list.get(0);
    if(beverage instanceof Beer){
      System.out.println("맥주");
    } else if (beverage instanceof Boricha) {
      System.out.println("보리차");
    } else if (beverage instanceof Beverage) {
      System.out.println("음료");
    }
  }
}
