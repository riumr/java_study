package day15.chapter18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DB에 데이터 추가하는 순서
public class DB5Demo {
  public static void main(String[] args) throws SQLException {
    // 1. 데이터 베이스에 연결 (jdbc driver와 database 연결정보를 이용해서 mysql 접속)
    Connection con = DBConnectionDemo.makeConnection();
    // 2. sql 작성
    String sql = "delete from mytable where id=?;";
    // 3. statement 객체 생성 -> set 메서드를 이용해서 변수값을 설정
    PreparedStatement ps = con.prepareStatement(sql);
    // 4. statement 객체. executeQuery/executeUpdate 를 사용해서 query 실행
    ps.setInt(1,3);
    ps.executeUpdate();
    ps.close();
    con.close();
  }
}
