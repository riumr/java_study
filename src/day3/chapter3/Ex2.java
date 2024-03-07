package day3.chapter3;

public class Ex2 {
  public static void main(String[] args) {
    double result01 = plus(10,20);
    System.out.println(result01);
    double result02 = minus(10,20);
    System.out.println(result02);
    double result03 = cross(10,20);
    System.out.println(result03);
    double result04 = divide(10,20);
    System.out.println(result04);
    result04 = divide(10L,20L);
    System.out.println(result04);
    result04 = divide(12.0,24.0);
    System.out.println(result04);
    result04 = divide(10,0);
    System.out.println(result04);
  }

  private static double plus(int num1,int num2){
    return num1 + num2;
  }

  private static double minus(int num1,int num2){
    return num1 - num2;
  }

  private static double cross(int num1,int num2){
    return num1*num2;
  }

  // 메서드 오버로딩 : 같은 이름의 메서드의 매개변수의 개수와 type을 다르게 한다.
  private static double divide(int num1,int num2){
    if (num2 !=0) {
      return (double) num1 / num2;
    }
    return -1;
  }

  private static double divide(double num1,double num2){
    if (num2 !=0) {
      return num1 / num2;
    }
    return -1;
  }

  private static double divide(long num1,long num2){
    if (num2 !=0) {
      return (double) num1 / num2;
    }
    return -1;
  }
}
