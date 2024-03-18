package day10.chapter8;

import java.util.ArrayList;

// Generic 타입 객체 ArrayList<T>
public class GenericDemo {
  public static void main(String[] args) {
    ArrayList<Integer> ai = new ArrayList<>();
    ai.add(10);
    Integer i= ai.get(0) + 10;
    System.out.println(i);

    ArrayList<String> as= new ArrayList<>();
    as.add("abc");
    String s = as.get(0)+"def";
    System.out.println(s);

    ArrayList<Object> ao = new ArrayList<>();
    ao.add(1);
    ao.add("a");
    ao.add("3.14");
    System.out.println(ao.get(0));
  }
}
