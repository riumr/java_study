package day4.exercise;

import java.util.Scanner;

public class MemberDemo {
  // Member 클래스를 이용해서 Member를 생성하고, 로그인 후 로그인에 성공하면 로그아웃 하는 프로그램을 만드시오.
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.println("아이디를 입력하세요");
  String id = in.nextLine();
  System.out.println("패스워드를 입력하세요");
  String password = in.nextLine();
    Member m1 = new Member("hong","hong");
    if(m1.logIn(id,password)){
      System.out.println("로그인에 성공했습니다.");
      if(m1.logOut(id)){
        System.out.println("로그아웃 했습니다.");
      } else {
        System.out.println("로그아웃에 실패했습니다.");
      }
    } else {
        System.out.println("로그인에 실패했습니다.");
    }
  }
}
