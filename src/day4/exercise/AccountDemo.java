package day4.exercise;

import java.util.Scanner;

public class AccountDemo {
  public static void main(String[] args) {
    Account account = new Account("민수", "1111", 1000, "1111");
    Scanner in = new Scanner(System.in);
    System.out.println("계좌번호와 비밀번호를 입력하세요");
    String accountNumber = in.nextLine();
    String accountPassword = in.nextLine();
    // 계좌번호, 비밀번호 체크
    if (account.getAccountNumber().equals(accountNumber)) {
      if (account.getAccountPassword().equals(accountPassword)) {
        System.out.println("메뉴 : 1.입금 2.출금 3.잔고확인 4.종료");
        int menu = in.nextInt();
        // 입금
        if (menu == 1) {
          System.out.print("입금 = ");
          long amount = in.nextLong();
          account.deposit(amount);
          account.checkBalance();
        }
        // 출금
        if (menu == 2){
          System.out.print("출금 = ");
          long amount = in.nextLong();
          account.withdraw(amount);
          account.checkBalance();
        }
        // 잔고확인
        if (menu == 3){
          account.checkBalance();
        }
        // 종료
        if (menu == 4){
          System.out.println("프로그램을 종료합니다");
        }
      }
    }

  }
}
