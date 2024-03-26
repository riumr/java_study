package day15.chapter18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// preparedStatement 인터페이스. sql문 작성과 값 추가 분리
public class DB4Demo {
  public static void main(String[] args) throws SQLException {
    Connection con = DBConnectionDemo.makeConnection();
    PreparedStatement ps = con.prepareStatement("UPDATE mytable SET age = ? WHERE id = ?;");
    ps.setInt(1, 45);
    ps.setInt(2, 1);
    if (ps.executeUpdate() == 1) {
      System.out.println("수정 성공");
    } else {
      System.out.println("수정 실패");
    }
    con.close();
    ps.close();
  }
}
