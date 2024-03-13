package day7.chapter6;

class Box {
  public Box(String s){

  }
  public Box(){ // (다른 생성자만 있고) 기본 생성자가 없으면 상속 시 오류가 발생한다.

  }
}

class ColoredBox extends Box{
//  public ColoredBox(){
//    super(); // 해당 메소드가 업으면 컴파일러가 자동으로 추가한다.
//  }
}

public class BoxDemo{
  public static void main(String[] args) {
    ColoredBox coloredBox = new ColoredBox();
    System.out.println(coloredBox);
  }
}
