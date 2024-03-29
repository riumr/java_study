package day17.LibraryProject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CheckoutDemo {
  public static void main(String[] args) throws SQLException {
    // checkout DAO에 입력할 값
    CheckoutDAO checkoutDAO = new CheckoutDAO();
    Scanner in = new Scanner(System.in);
    System.out.println("실행할 메뉴를 선택해주세요");
    System.out.println("1.전체 도서대출 현황 조회 2. 대출도서 검색 2.도서 대출 3.도서 반납");
    int menu = in.nextInt();
    // 전체 도서대출 현황 조회
    if (menu == 1) {
      System.out.println("전체 도서 대출 현황 조회하기");
      List<Checkout> checkouts = checkoutDAO.checkoutList();
      System.out.println(checkouts);
    }

    // 대출 도서 검색
    int subMenu = 0;
    if (menu == 2) {
      System.out.println("1. 사용자명으로 조회 2. 도서명으로 조회");
      subMenu = in.nextInt();
    }

    // 사용자명으로 검색
    if(subMenu==1){
      int userId = in.nextInt();
      List<Checkout> checkouts = checkoutDAO.checkoutListByUser(userId);
      System.out.println(checkouts);
    }

    // 도서명으로 검색
    if(subMenu==2){
      int bookId = in.nextInt();
      List<Checkout> checkouts = checkoutDAO.checkoutListByBook(bookId);
      System.out.println(checkouts);
    }

    // 도서 대출
    if (menu == 3) {
      System.out.println("도서 대출");
      // 임의의 도서의 바코드를 스캔했다고 가정
      System.out.println("스캔 완료");
      Checkout checkout = new Checkout(null,1,1,1,null,null,false,null,null);
      checkoutDAO.checkoutBook(checkout);
    }

    // 도서 반납
    if (menu == 4) {
      System.out.println("도서 반납");
      // 임의의 도서의 바코드를 스캔했다고 가정
      System.out.println("스캔 완료");
      Checkout checkout = new Checkout(null,1,1,1,null,null,false,null,null);
      checkoutDAO.checkin(checkout);
    }
  }
}
