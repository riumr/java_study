package day17.LibraryProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CheckoutDAO {
  // 대출 도서 조회
  public List<Checkout> checkoutList() throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,library_id,book_id,user_id,checkout_date,return_date,renewed,renew_return_date,checkin_date from checkout;";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        Checkout checkout = new Checkout(rs.getInt(1), rs.getInt(2), rs.getInt(3),
            rs.getInt(4), rs.getDate(5), rs.getDate(6),rs.getBoolean(7),rs.getDate(8),rs.getDate(9));
        checkoutList.add(checkout);
      }
    }
    return checkoutList;
  }

  // 유저 id로 조회
  public List<Checkout> checkoutListByUser(Integer userId) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,library_id,book_id,user_id,checkout_date,return_date,renewed,renew_return_date,checkin_date from checkout where user_id= ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1,userId);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        Checkout checkout = new Checkout(rs.getInt(1), rs.getInt(2), rs.getInt(3),
            rs.getInt(4), rs.getDate(5), rs.getDate(6),rs.getBoolean(7),rs.getDate(8),rs.getDate(9));
        checkoutList.add(checkout);
      }
    }
    return checkoutList;
  }

  // 도서 id로 조회
  public List<Checkout> checkoutListByBook(Integer bookId) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,library_id,book_id,user_id,checkout_date,return_date,renewed,renew_return_date,checkin_date from checkout where book_id= ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1,bookId);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        Checkout checkout = new Checkout(rs.getInt(1), rs.getInt(2), rs.getInt(3),
            rs.getInt(4), rs.getDate(5), rs.getDate(6),rs.getBoolean(7),rs.getDate(8),rs.getDate(9));
        checkoutList.add(checkout);
      }
    }
    return checkoutList;
  }

  // 도서 대출(checkout)
  public void checkoutBook(Checkout checkout) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "insert into checkout (library_id,book_id,user_id,checkout_date,return_date) values (?,?,?,?,?);";
    PreparedStatement ps = con.prepareStatement(sql);
    // 날짜 정보는 메소드 실행 날짜로 임의로 설정
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    // 대출일(checkout date)
    String checkoutDate = formatter.format(date);
    // 반납예정일(return date)
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    cal.add(Calendar.DATE,15);
    String returnDate = formatter.format(cal.getTime());
    ps.setInt(1,checkout.getLibraryId());
    ps.setInt(2,checkout.getBookId());
    ps.setInt(3,checkout.getUserId());
    ps.setDate(4,java.sql.Date.valueOf(checkoutDate));
    ps.setDate(5,java.sql.Date.valueOf(returnDate));
    int checkoutQuery = ps.executeUpdate();
    if(checkoutQuery==1){
      System.out.println("대출완료");
    } else {
      System.out.println("다시 시도해주세요");
    }
  }

  // 도서 반납(checkin)
  public void checkin(Checkout checkout) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "update checkout set checkin_date=? where book_id= ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    // 날짜 정보는 메소드 실행 날짜로 임의로 설정
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    // 반납 날짜
    String checkinDate = formatter.format(date);
    ps.setDate(1, java.sql.Date.valueOf(checkinDate));
    ps.setInt(2,checkout.getBookId());
    ps.executeQuery();
  }
}
