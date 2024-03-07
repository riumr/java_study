package day3.chapter3;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    // 1. 점수를 키보드를 통해 입력을 받는다.
    System.out.println("100, 90, 80, 70, 60의 정수만 입력하세요 : ");
    Scanner in = new Scanner(System.in);
    int score = in.nextInt();
    // 2. 점수를 학점으로 변환한다. (90~100 : A, 80~89 : B, 0~79 : 전부 C)
    String grade = "";
    if (score>=90 && score<=100) {
      grade="A";
    } else if (score>=80) {
      grade="B";
    } else {
      grade="C";
    }
    System.out.printf("입력받은 점수 %d 의 학점은 %s 입니다\n",score,grade);

    grade = ""; // 90, 80, 70, 60
    switch (score) {
      case 100, 90:
        grade="A";
        System.out.println("100점이거나 90점입니다");
        break;
      case 80:
        grade="B";
        System.out.println("80점입니다");
        break;
      case 70:
        grade="C";
        System.out.println("70점입니다");
        break;
      default:
        grade="F";
        System.out.println("60점입니다");
        break;
    }
    System.out.printf("입력받은 점수 %d 의 학점은 %s 입니다",score,grade);
  }
}
