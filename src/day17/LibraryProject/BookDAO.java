package day17.LibraryProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class BookDAO {

  public List<Book> bookList() throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,library_id, book_name,writer_name, publisher from books;";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        Book book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    }
    return bookList;
  }

  public List<Book> bookListByName(String bookname) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,library_id, book_name,writer_name, publisher from books where book_name like ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, "%"+bookname+"%");
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while (rs.next()) {
        book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    } else {
      System.out.println("찾는 도서가 없습니다.");
    }
    return bookList;
  }

  public List<Book> bookListByWriter(String writer) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,library_id, book_name,writer_name, publisher from books where writer_name like ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, writer);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        Book book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    } else {
      System.out.println("찾는 도서가 없습니다.");
    }
    return bookList;
  }

  public List<Book> bookListByPublisher(String publisher) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,library_id, book_name,writer_name, publisher from books where publisher like concat ('%',?,'%');";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, publisher);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        Book book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5), "", "", "", "");
        bookList.add(book);
      }
    } else {
      System.out.println("찾는 도서가 없습니다.");
    }
    return bookList;
  }

  public void bookCreate(Book book) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "insert into books (id,library_id,book_name,writer_name,publisher,classifier,isbn,kubun,status) values (?,?,?,?,?,?,?,?,?);";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1, book.getId());
    ps.setInt(2, book.getLibraryId());
    ps.setString(3, book.getBookName());
    ps.setString(4, book.getWriterName());
    ps.setString(5, book.getPublisher());
    ps.setString(6, "");
    ps.setString(7, book.getIsbn());
    ps.setString(8, "");
    ps.setString(9, "");
    if (ps.executeUpdate() == 1) {
      System.out.println("도서 정보 추가 성공");
    } else {
      System.out.println("도서 정보 추가 실패");
    }
    ps.close();
    con.close();
  }

  public void bookUpdate(Book book, String status) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "update books set status=? where id=?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,status);
    ps.setInt(2,book.getId());
    int success = ps.executeUpdate();
    if (success==1){
      System.out.println("도서 상태 수정 성공");
    } else {
      System.out.println("도서 상태 수정 실패");
    }
  }

  public boolean bookCheck(Book book) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select from books where id=?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1,book.getId());
    ResultSet rs = ps.executeQuery();
    if(rs.getString(9).equals("checkout")){
      return false;
    }
    return true;
  }

  public void bookDelete(Book book) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "Delete from books where id=?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1, book.getId());
    if (ps.executeUpdate() == 1) {
      System.out.println("도서 정보 삭제 성공");
    } else {
      System.out.println("도서 정보 삭제 실패");
    }
    ps.close();
    con.close();
  }

  public boolean isbnDuplicateCheck(Book book) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select * from books where isbn = ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,book.getIsbn());
    ResultSet rs = ps.executeQuery();
    // query실행 값이 존재하면 false
    return false;
  }
}
