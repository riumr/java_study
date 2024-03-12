package day4.exercise;

public class Circle {
  // 정적 멤버, static 멤버, class 멤버
  static int numberOfCircles;

  // 인스턴스 멤버
  // 필드
  int radius;
  String color="";

  // 메서드
  // 정적 메서드
  static void staticMethod1(){
    System.out.println(numberOfCircles);
  }

  // 인스턴스 메서드
  double instanceMethod1(){
    return 1234;
  }

  // 생성자
  public Circle(int radius, String color){
    this.radius=radius;
    this.color=color;
    System.out.println(color+"의 크기가 "+radius+"인 circle이 "+ ++numberOfCircles+"개 생성되었습니다.");
  }
}
