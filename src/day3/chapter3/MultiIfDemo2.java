package day3.chapter3;

import java.util.Scanner;

public class MultiIfDemo2 {
  public static void main(String[] args) {
    scoreAndGrade();
  }

  private static void scoreAndGrade() {
    // 1. 점수를 키보드를 통해 입력을 받는다.
    System.out.println("점수를 입력하세요");
    Scanner in = new Scanner(System.in);
    int score = in.nextInt();

    // 1-1. 입력받은 점수가 유효한 범위 내에 있는지 체크한다.
    boolean checked = checkScore(score);
    String grade = "";

    // 2. 1-1에서 유효한 범위의 점수이면 점수를 학점으로 변환한다. (90~100 : A, 80~89 : B, 0~79 : 전부 C)
    if (checked) {
      if (score >= 90 && score <= 100) {
        grade = "A";
      } else if (score >= 80) {
        grade = "B";
      } else {
        grade = "C";
      }
      System.out.printf("입력받은 점수 %d 의 학점은 %s 입니다", score, grade);
    } else {
      // 2. 유요하지 않은 점수이면 종료한다.
      System.out.println("유효하지 않은 점수가 입력되어 프로그램을 종료합니다.");
    }
  }

  private static boolean checkScore(int score) {
    if(score<0 || score > 100) {
    // System.out.println("범위를 벗어났습니다");
      return false;
    }
    // System.out.println("정상 범위입니다");
    return true;
  }
}
