package day7.chapter5;

import java.util.Scanner;

// String method 사용 문제 풀기
public class StringCheck {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("url을 입력해주세요");
    String s = in.nextLine();
    while(!s.equals("bye")){
      if (s.endsWith("com")) {
        System.out.println(s +"은 \'com\'으로 끝납니다.");
      }
      if (s.contains("java")) {
        System.out.println(s+"은 \'java\'를 포함합니다.");
      }
    }
  }
}
