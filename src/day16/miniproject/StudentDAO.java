package day16.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
  public static void updateStudent(Connection con, int id, int amount) throws SQLException {
    System.out.println("학생 금액을 수정합니다.");
    String sql = "update students set amount= ? where id= ?;";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setInt(1, amount);
    statement.setInt(2, id);
    if (statement.executeUpdate() == 1) {
      System.out.println("학생 금액 수정 성공");
    } else {
      System.out.println("학생 금액 수정 실패");
    }
    statement.executeUpdate();
    statement.close();
    con.close();
  }

  public static void updateStudent(Connection con, int id, String name) throws SQLException {
    System.out.println("학생 이름을 수정합니다.");
    String sql = "update students set name= ? where id= ?;";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setString(1, name);
    statement.setInt(2, id);
    if (statement.executeUpdate() == 1) {
      System.out.println("학생 이름 수정 성공");
    } else {
      System.out.println("학생 이름 수정 실패");
    }
    statement.executeUpdate();
    statement.close();
    con.close();
  }

  public static void insertStudent(Connection con, String name, String date, int amount) throws SQLException {
    System.out.println("학생 정보를 추가합니다.");
    String sql = "insert into students (name,date,amount) values (?,?,?);";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setString(1, name);
    statement.setDate(2, java.sql.Date.valueOf(date));
    statement.setInt(3, amount);
    if (statement.executeUpdate() == 1) {
      System.out.println("학생 정보 추가 성공");
    } else {
      System.out.println("학생 정보 추가 실패");
    }
    statement.close();
    con.close();
  }

  public static Students getStudent(Connection con,int id) throws SQLException {
    String sql = "select * from students where id = ?;";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setInt(1,id);
    ResultSet resultSet = statement.executeQuery(sql);
    String name = resultSet.getString(3);
    String date = resultSet.getString(2);
    int amount = resultSet.getInt(4);
    if(resultSet!=null && resultSet.next()){
      if (resultSet.getInt(1)==id){
       return new Students(id,date,name,amount);
      } else{
        return null;
      }
    } else {
      return null;
    }
  }
}
