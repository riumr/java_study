package day2.chapter2;

/**
 * 0으로 나누는 경우
 */
public class OpDemo3 {
  public static void main(String[] args) {
  // int result = 5 / 0; // ArthmeticExceiption; / by zero

    System.out.println(Double.isInfinite(5 / 0.0));
    System.out.println(Double.isNaN(5 % 0.0));
  }
}
