package day9.chapter7;

// Triangle 클래스 테스트
public class TriangleTest {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(3,3);
    Triangle t2 = new Triangle(4,2);

    if (t1.compareTo(t2)==1){
      System.out.println(t1+"이 더 큽니다");
    } else if (t1.compareTo(t2)==0) {
      System.out.println("둘은 "+t1+"으로 같습니다");
    } else if (t1.compareTo(t2)==-1) {
      System.out.println(t2+"이 더 큽니다");
    }
  }
}
