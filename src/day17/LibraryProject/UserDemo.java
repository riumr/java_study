package day17.LibraryProject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserDemo {
  public static void main(String[] args) throws SQLException {
    // 유저 DAO에 입력할 값
    UserDAO userDAO = new UserDAO();
    Scanner in = new Scanner(System.in);
    System.out.println("실행할 메뉴를 선택해주세요");
    System.out.println("1.유저 리스트 조회 2.유저 추가 3.유저 정보 수정 4.유저 삭제");
    int menu = in.nextInt();
    int subMenu = 0;
    if (menu == 1) {
      System.out.println("1. 유저 조회 2. 유저 검색");
      subMenu = in.nextInt();
    }

    // 유저 조회 기능
    if (subMenu == 1) {
      System.out.println("전체 도서 목록 조회하기");
      List<User> users = userDAO.userList();
      System.out.println(users);
    }

    // 유저 검색 방법 선택
    int searchMenu = 0;
    if (subMenu == 2) {
      System.out.println("1.유저명으로 검색 2.id로 검색");
      searchMenu = in.nextInt();
      in.nextLine();
    }

    // 유저명으로 검색
    if (searchMenu == 1) {
      String name = in.nextLine();
      List<User> usersByName = userDAO.userListByName(name);
      System.out.println(usersByName);
    }

    // id로 검색
    if (searchMenu == 2) {
      int id = in.nextInt();
      List<User> usersByid = userDAO.userListById(id);
      System.out.println(usersByid);
    }

    // 유저 추가 기능
    if (menu == 2) {
      System.out.println("유저 추가 하기");
      System.out.println("유저 id, 유저명, 전화번호, 주소, 도서관 id를 입력하세요");
      System.out.print("유저 id : ");
      int id = in.nextInt();
      in.nextLine();
      System.out.print("유저명 : ");
      String username = in.nextLine();
      System.out.print("전화번호 : ");
      String telephone = in.nextLine();
      System.out.print("주소 : ");
      String address = in.nextLine();
      System.out.print("도서관 id : ");
      int libraryId = in.nextInt();
      User user = new User(id, username, telephone, address, 0, libraryId);
      userDAO.userCreate(user);
    }

    // 유저 수정 기능
    if (menu == 3) {
      System.out.println("정보를 변경할 유저의 id를 입력해주세요");
      int id = in.nextInt();
      User user = new User(id, "", "", "", 0, 0);
      // 연락처로 인증 후
      String address = in.nextLine();
      userDAO.userUpdate(user, address);
    }

    // 유저 삭제 기능
    if (menu == 4) {
      System.out.println("삭제할 유저의 id를 입력해주세요");
      int id = in.nextInt();
      User user = new User(id, "", "", "", 0, 0);
      // 반납 여부 확인
      if (userDAO.userCheck(user)) {
        userDAO.userDelete(user);
      }
    }
  }
}
