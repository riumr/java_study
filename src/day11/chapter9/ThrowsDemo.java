package day11.chapter9;

import java.util.Scanner;

// 예외 떠넘기기(Throw Exception)
public class ThrowsDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자를 입력해주세요 : ");
    String s = in.nextLine();
    try {
      square(s);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
      System.out.println("정수만 입력해주세요");
    }
  }

  private static void square(String s) throws NumberFormatException{
    int a = Integer.parseInt(s);
    System.out.println(a*a);
  }
}
