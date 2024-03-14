package day8.chapter6;

public class SportsCar extends Car{
  String name = "스포츠카";

  @Override
  void whoami() {
    System.out.println("나는 스포츠 카이다.");
  }
}
