package day17.LibraryProject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class LibraryDemo {
  public static void main(String[] args) throws SQLException {
    BookDAO bookDAO = new BookDAO();
    Scanner in = new Scanner(System.in);
    System.out.println("실행할 메뉴를 선택해주세요");
    System.out.println("1.도서 목록 조회 2.도서 추가 3.도서 정보 수정 4.도서 삭제");
    int menu = in.nextInt();
    int subMenu = 0;
    if (menu == 1) {
      System.out.println("1. 도서 조회 2. 검색");
      subMenu = in.nextInt();
    }

    // 도서 조회
    if (subMenu == 1) {
      System.out.println("전체 도서 목록 조회하기");
      List<Book> books = bookDAO.bookList();
      System.out.println(books);
    }

    // 도서 검색
    int searchMenu = 0;
    if (subMenu == 2) {
      System.out.println("1.도서명으로 검색 2.저자명으로 검색 3.출판사로 검색");
      searchMenu = in.nextInt();
      in.nextLine();
    }
    // 도서명으로 검색
    if (searchMenu == 1) {
      String name = in.nextLine();
      bookDAO.bookListByName(name);
      List<Book> booksByName = bookDAO.bookList();
      System.out.println(booksByName);
    }

    // 저자명으로 검색
    if (searchMenu == 2) {
      String writerName = in.nextLine();
      bookDAO.bookListByWriter(writerName);
      List<Book> booksByWriter = bookDAO.bookList();
      System.out.println(booksByWriter);
    }

    // 출판사로 검색
    if (searchMenu == 3) {
      String publisher = in.nextLine();
      bookDAO.bookListByPublisher(publisher);
      List<Book> booksByPublisher = bookDAO.bookList();
      System.out.println(booksByPublisher);

    }

    // 도서 추가
    if (menu == 2) {
      System.out.println("도서 추가 하기");
      System.out.println("도서 id, 도서관 id, 도서명, 저자명, 출판사를 입력하세요");
      System.out.print("도서 id : ");
      int id = in.nextInt();
      System.out.print("도서관 id : ");
      int libraryId = in.nextInt();
      in.nextLine();
      System.out.print("도서명 : ");
      String bookName = in.nextLine();
      System.out.print("저자명 : ");
      String writerNameAdd = in.nextLine();
      System.out.print("출판사 : ");
      String publisherAdd = in.nextLine();
      System.out.print("isbn : ");
      String isbn = in.nextLine();
      Book book = new Book(id, libraryId, bookName, writerNameAdd, publisherAdd, "", isbn, "", "");
      bookDAO.bookCreate(book);
    }

    // 도서 정보 수정
    if (menu == 3) {
      System.out.println("정보를 변경할 도서 정보의 id를 입력해주세요");
      int id = in.nextInt();
      Book book = new Book(id, 0, "", "", "", "", "", "", "");
      String status = "checkout";
      bookDAO.bookUpdate(book, status);
    }

    // 도서 정보 삭제
    if (menu == 4) {
      System.out.println("삭제할 도서 정보의 id를 입력해주세요");
      int id = in.nextInt();
      Book book = new Book(id, 0, "", "", "", "", "", "", "");
      boolean bookChecking = bookDAO.bookCheck(book);
      if (bookChecking) {
        bookDAO.bookDelete(book);
      }
    }
  }

}
