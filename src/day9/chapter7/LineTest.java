package day9.chapter7;

// 구현한 클래스 Line 사용
public class LineTest {
  public static void main(String[] args) {
    Line l1 = new Line(10);
    Line l2 = new Line(20);

    if (l1.compareTo(l2)==1){
      System.out.println(l1+"이 더 큽니다");
    } else if (l1.compareTo(l2)==0) {
      System.out.println("같습니다");
    } else if (l1.compareTo(l2)==-1){
      System.out.println(l2+"이 더 큽니다");
    }

  }
}
