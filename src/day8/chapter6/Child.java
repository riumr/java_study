package day8.chapter6;

public class Child extends Parent{
  String name = "child";

  @Override
  void print() {
    System.out.println("I'm child");
  }
}
