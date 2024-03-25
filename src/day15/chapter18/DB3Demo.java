package day15.chapter18;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB에 연결해서 데이터 가져오기
public class DB3Demo {
  public static void main(String[] args) throws SQLException {
    Connection con = DBConnectionDemo.makeConnection();
    Statement stmt = con.createStatement();
    String sql = "SELECT name, age FROM mytable;";
    ResultSet rs = stmt.executeQuery(sql);
    while(rs.next()){
      System.out.print("name : "+rs.getString(1)+"\t");
      System.out.println("age : "+rs.getInt("age"));
    }
    con.close();
    stmt.close();
  }
}
