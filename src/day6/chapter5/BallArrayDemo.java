package day6.chapter5;

// 객체로 구성된 배열 구현
public class BallArrayDemo {
  public static void main(String[] args) {
    Ball[] balls = new Ball[5];
    // 객체가 없으므로 모두 null 값이 출력된다
    for (Ball ball : balls) {
      System.out.println(ball);
    }
    // 원소 두개에만 객체를 넣는다
    for (int i = 0; i < 2; i++) {
      balls[i]=new Ball(10,"red");
    }
    // 객체가 들어간 원소는 주소가 출력된다
    for (Ball ball : balls) {
      System.out.println(ball);
//      ball.print(); // NullPointerException 발생
      if (ball != null) { // NullPointerException 방지
        ball.print();
      }
    }
  }
}
