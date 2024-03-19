package day11.chapter9;

// Error의 종류
public class ExceptionDemo {
  public static void main(String[] args) {
    // ArithmeticException
    ArithmeticException e = new ArithmeticException("abc");
    System.out.println(e.getMessage());
    // e.printStackTrace();

    // int i = 5/0;

    // NullPointerException
    String s=null;
    // System.out.println(s.length());

    Object o=null;
    Object o1=null;
    // System.out.println(o.equals(o1));

    // String[] strings=null;
    // System.out.println(strings.length);
  }
}
