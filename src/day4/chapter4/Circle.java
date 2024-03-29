package day4.chapter4;

public class Circle {
  // 멤버 = 필드, 메서드
  private int radius;
  private String color;

  String getColor(){
    return color;
  }

  void setColor(String color){
    this.color = color;
  }

  int getRadius(){ // 접근자
    return radius;
  }

  void setRadius(int radius){ // 설정자
    if (radius > 0) {
      this.radius = radius;
    }
    else {
      System.out.println("원의 반지름은 0보다 커야 합니다");
    }
  }

  double findArea(){
    return 3.14*radius*radius;
  }
  void show(){
    System.out.printf("반지름의 크기는 : %d, 색깔은 %s인 원의 넓이는 %.2f\n",radius,color,findArea());
  }

  // 생성자. 생성자를 만들면 기본 생산자는 더이상 사용할 수 없다.
  Circle(int radius){
    this(radius,"white");
  }

  // 생성자 오버로딩
  Circle(String color){
    this(1,color);
  }

  Circle(int radius,String color){
    if (radius > 0){
      this.radius = radius;
    }
    this.color=color;
  }

  Circle(){
    this(1,"white");
  }

}
