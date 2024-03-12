package day6.chapter5;

import day4.exercise.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    int menu;
    Account account;
    long amount;
    do {
      System.out.println("1.계좌생성 2.입금 3.출금 4.잔고 5.종료");
      menu = in.nextInt();
      in.nextLine(); // nextLine 스킵을 방지하기 위해 삽입
      switch (menu) {
        case 1:
          System.out.print("예금주명 : ");
          String accountName = in.nextLine();
          System.out.print("계좌번호 : ");
          String accountNumber = in.nextLine();
          System.out.print("초기금액 : ");
          long balance = in.nextLong();
          in.nextLine();
          System.out.print("비밀번호 : ");
          String accountPassword = in.nextLine();
          // Account 객체 생성
          account = new Account(accountName, accountNumber, balance, accountPassword);
          accounts.add(account);
          System.out.println("계좌를 생성합니다.");
          break;
        // 입금
        case 2:
          System.out.println("입금");
          System.out.println("계좌번호를 입력해주세요");
          String accountNo = in.nextLine();
          for (Account account1 : accounts) {
            if (account1.getAccountNumber().equals(accountNo)) {
              System.out.println("입금할 금액을 입력해주세요");
              amount = in.nextLong();
              account1.deposit(amount);
              System.out.println("입금하겠습니다");
              account1.checkBalance();
            }
          }
          break;
        // 출금
        case 3:
          System.out.println("계좌번호를 입력해주세요");
          String accountNo2 = in.nextLine();
          for (Account account1 : accounts) {
            if (account1.getAccountNumber().equals(accountNo2)) {
              System.out.println("비밀번호를 입력해주세요");
              String passwordInput = in.nextLine();
              if (!account1.getAccountPassword().equals(passwordInput)) {
                System.out.println("비밀번호가 다릅니다.");
                break;
              }
              System.out.println("출금할 금액을 입력해주세요");
              long minus = in.nextLong();
              account1.withdraw(minus);
              System.out.println("출금하겠습니다");
              account1.checkBalance();
            }
          }
          break;
        // 잔액확인
        case 4:
          System.out.println("계좌번호를 입력해주세요");
          String accountNo3 = in.nextLine();
          for (Account account1 : accounts) {
            if (account1.getAccountNumber().equals(accountNo3)) {
              System.out.println("비밀번호를 입력해주세요");
              String passwordInput = in.nextLine();
              if (!account1.getAccountPassword().equals(passwordInput)) {
                System.out.println("비밀번호가 다릅니다.");
                break;
              }
              System.out.println("잔고를 보여드리겠습니다");
              account1.checkBalance();
            }
          }
          break;
        case 5:
          System.out.println("종료하겠습니다");
          break;
      }
    } while (menu != 5);
    // 계좌 생성 확인
    for (Account account1 : accounts) {
      System.out.println("계좌번호 : "+account1.getAccountNumber());
      System.out.println("예금주명 : "+account1.getAccountName());
      System.out.println("잔고 : "+account1.getBalance());
    }
  }
}
