package day3.chapter3;

import java.util.Scanner;

public class MethodDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("점수를 입력해주세요");
    int score = in.nextInt();
    if(checkScore(score)){
      System.out.println("정상 범위입니다.");
    }
    else {
      System.out.println("범위를 벗어났습니다");
    }
  }

  private static boolean checkScore(int score) {
    if(score<0 || score > 100) {
//      System.out.println("범위를 벗어났습니다");
      return false;
    }
//    System.out.println("정상 범위입니다");
    return true;
  }
}
