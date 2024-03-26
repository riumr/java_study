package day16.miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
  public static Connection getConnection() {
    String url = "jdbc:mysql://localhost/foodcon?serverTimezone=Asia/Seoul";
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

