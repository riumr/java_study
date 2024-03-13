package day7.chapter5;

// random 메서드 사용 배열 요소 무작위 출력 실습
public class RockScissorPaper {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
    double random;
    for (int i = 0; i < 10; i++) {
      random = Math.random()*3;
      System.out.println(name[(int)random]);
    }
  }
}
