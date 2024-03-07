package day3.chapter3;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    accountManagement();
  }

  private static void accountManagement() {
    int menu;
    int amount;
    int rest=0;
    String res="";
    Scanner in = new Scanner(System.in);
    do {
      // 1. 안내 메시지를 출력한다.
      System.out.println("메뉴를 입력해주세요 : 1.입금, 2.출금, 3.잔고, 4.종료");
      // 2. 메뉴를 선택해서 입력한다.
      menu = in.nextInt();
      // 3. 입력된 메뉴에 따라 입금, 출금, 잔고, 종료
      switch (menu) {
        case 1 -> {
          amount = in.nextInt();
          res ="입금하겠습니다\n";
          rest+=amount;
        }
        case 2 -> {
          amount = in.nextInt();
          res = "출금하겠습니다\n";
          rest-=amount;
        }
        case 3 -> {
          res = "잔고를 보여드렸습니다\n";
          System.out.println(rest);
        }
        case 4 -> res = "종료하겠습니다\n";
        default -> {
          res = "다시 입력해주세요\n";
        }
      };
      System.out.printf("%s",res);
      // 4. 1,2,3을 계속 반복한다. 종료 메뉴가 선택되기 전까지
    } while (menu!=4);
  }
}
