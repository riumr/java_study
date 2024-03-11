package day5.chapter4;

import day4.exercise.Circle;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getSingleton();
    Singleton singleton2 = Singleton.getSingleton();

    System.out.println(singleton);
    System.out.println(singleton2);


    Circle c1 = new Circle(10,"white");
    Circle c2 = new Circle(100,"white");

    System.out.println(c1);
    System.out.println(c2);
  }
}
