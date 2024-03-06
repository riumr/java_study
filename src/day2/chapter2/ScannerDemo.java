package day2.chapter2;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자(실수)를 입력하세요 : ");
    // int num = in.nextInt();
    // float num = in.nextFloat();
    String s = in.nextLine();
    double sChange = Double.parseDouble(s);
    double result = 1;
    System.out.printf("당신이 입력한 내용은 %s 입니다.",s);
    System.out.printf("당신이 입력한 숫자에 1을 더하면 %f 입니다",sChange+1);
  }
}
