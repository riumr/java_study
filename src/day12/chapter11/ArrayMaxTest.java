package day12.chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayMaxTest {
  public static void main(String[] args) {
    ArrayList<Integer> scores = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int i;
    do {
      System.out.print("점수를 입력하세요 : ");
      i = in.nextInt();
      scores.add(i);
    } while (i >= 0);
    int scoreLength = scores.size()-1;
    System.out.println("전체 학생은 " + scoreLength + "명 이다.");
    System.out.println("학생들의 성적 : " + scores.subList(0,scoreLength));
    for (int j = 0; j < scoreLength; j++) {
      String grade = "";
      if (scores.get(j) >= Collections.max(scores) - 10) {
        grade = "A";
      } else if ((scores.get(j) < Collections.max(scores) - 10) && (scores.get(j) >= Collections.max(scores) - 20)) {
        grade = "B";
      } else {
        grade = "C";
      }
      System.out.println(j + "번 학생의 성적은 " + scores.get(j) + "점이며 " + "등급은 " + grade + "이다.");
    }
  }
}
