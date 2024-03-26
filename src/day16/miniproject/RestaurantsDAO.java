package day16.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestaurantsDAO {
  public static void updateRestaurant(Connection con, int id, String name) throws SQLException {
    System.out.println("식당 정보를 수정합니다.");
    String sql = "update restaurants set name= ? where id= ?;";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setString(1, name);
    statement.setInt(2, id);
    if (statement.executeUpdate() == 1) {
      System.out.println("식당 정보 추가 성공");
    } else {
      System.out.println("식당 정보 추가 실패");
    }
    statement.executeUpdate();
    statement.close();
    con.close();
  }

  public static void insertRestaurant(Connection con, String name) throws SQLException {
    System.out.println("식당 정보를 추가합니다.");
    String sql = "insert into restaurants (name) values (?);";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setString(1, name);
    if (statement.executeUpdate() == 1) {
      System.out.println("식당 정보 추가 성공");
    } else {
      System.out.println("식당 정보 추가 실패");
    }
    statement.close();
    con.close();
  }

  public static Restaurants getRestaurant(Connection con, int id) throws SQLException {
    String sql = "select * from restaurants where id = ?;";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setInt(1, id);
    ResultSet resultSet = statement.executeQuery();
    String name = "";
    if (resultSet != null && resultSet.next()) {
      if (resultSet.getInt(1) == id) {
        return new Restaurants(id, resultSet.getString("name"));
      } else {
        return null;
      }
    } else {
      return null;
    }
  }
}
