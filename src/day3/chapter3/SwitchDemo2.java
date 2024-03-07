package day3.chapter3;

import java.util.Scanner;

public class SwitchDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("동물 이름을 입력하세요 : ");
    String animal = in.nextLine();
    String kind = "";

    // 개선된 switch 문
    kind = switch (animal){
      case "호랑이" -> "포유류";
      case "참새" -> "조류";
      case "고등어" -> "어류";
      default -> {
        System.out.print("어이쿠, ");
        yield "...";
      }
    };
    System.out.printf("%s는 %s이다",animal,kind);

//    // switch문 오류 테스트
//    final int ONE = 1;
//    int result=1;
//    int num = 10;
//    switch (result) {
//      case ONE:
//        System.out.println("1입니다.");
//      case num:
//        System.out.println("10입니다");
//      case 1.0:
//        System.out.println("1.0");
//    }

  }
}
