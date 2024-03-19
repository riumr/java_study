package day11.chapter10;

// lambda 식으로 Myfunction 인터페이스 method 사용
public class LambdaDemo3 {
  public static void main(String[] args) {
    method1((a, b) -> a > b ? a : b);
    Myfunction f = method2();
    System.out.println(f.max(3,2));
  }

  static void method1(Myfunction f) {
    System.out.println(f.max(3, 5));
  }

  static Myfunction method2(){
    return (a,b) -> a<b?a:b;
  }
}
