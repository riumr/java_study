package day15.chapter18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Mysql DB에 값 추가
public class DB2Demo {
  public static void main(String[] args) throws SQLException{
    Connection con = makeConnection();
    Statement stmt = con.createStatement();
    String sql = "insert into mytable (id, name, age) values (4,'이','34')";
    if(stmt.executeUpdate(sql)==1){
      System.out.println("레코드 추가 성공");
    } else{
      System.out.println("레코드 추가 실패");
    }
    con.close();
    stmt.close();

  }
  private static Connection makeConnection() {
    String url = "jdbc:mysql://localhost/mydata?serverTimezone=Asia/Seoul";
    Connection connect = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("데이터베이스 연결 중 ...");
      connect = DriverManager.getConnection(url, "root", "1111");
      System.out.println("데이터베이스 연결 성공 !!!");
    } catch (ClassNotFoundException e) {
      System.out.println("jdbc 드라이버를 찾지 못했습니다");
    } catch (SQLException e){
      System.out.println("데이터베이스 연결 실패 ... ");
    }
    return connect;
  }
}
