package day7.chapter6;

// 상속받은 객체
public class Ball extends Circle{
  String color;
  Ball(String color){
    this.color=color;
  }
  void findColor(){
    System.out.println(color+"색 공입니다.");
  }

  // 객체 상속받아서 override
  @Override // annotation이 없어도 작동하며, annotation은 override하고 있다는 점을 컴파일러에 알리는 역할을 한다.
  void findArea() {
    System.out.println("넓이는 4*3.14*반지름의 제곱입니다.");
    //
    super.findArea();
  }

  void findVolume(){
    System.out.println("부피는 3/4*3.14*반지름의 세제곱입니다.");
  }
}
