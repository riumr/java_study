package day17.LibraryProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class UserDAO {
  // 유저 추가
  public void userCreate(User user) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "insert into users (id,username,telephone,address,point,library_id) values (?,?,?,?,?,?);";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1, user.getId());
    ps.setString(2, user.getUsername());
    ps.setString(3, user.getTelephone());
    ps.setString(4, user.getAddress());
    ps.setInt(5, user.getPoint());
    ps.setInt(6, user.getLibraryId());
    if (ps.executeUpdate() == 1) {
      System.out.println("유저 정보 추가 성공");
    } else {
      System.out.println("유저 정보 추가 실패");
    }
    ps.close();
    con.close();
  }

  // 유저 정보 조회 (정보 리스트)
  public List<User> userList() throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,username,telephone,address,point,library_id from users;";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<User> userList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
            rs.getString(4), rs.getInt(5), rs.getInt(6));
        userList.add(user);
      }
    }
    return userList;
  }

  // 유저 정보 조회 (유저명으로)
  public List<User> userListByName(String username) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,username,telephone,address,point,library_id from users where user_name like ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, "%" + username + "%");
    ResultSet rs = ps.executeQuery();
    List<User> userList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
            rs.getString(4), rs.getInt(5), rs.getInt(6));
        userList.add(user);
      }
    } else {
      System.out.println("해당 유저를 찿을 수 없습니다.");
    }
    return userList;
  }

  // 유저 정보 조회(유저 Id로)
  public List<User> userListById(Integer id) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select id,username,telephone,address,point,library_id from users where id like ?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, "%" + id + "%");
    ResultSet rs = ps.executeQuery();
    List<User> userList = new LinkedList<>();
    if (rs != null) {
      while (rs.next()) {
        User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3),
            rs.getString(4), rs.getInt(5), rs.getInt(6));
        userList.add(user);
      }
    } else {
      System.out.println("해당 유저를 찿을 수 없습니다.");
    }
    return userList;
  }

  // 유저 정보 수정
  public void userUpdate(User user,String address) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "update users set address=? where id=?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1, address);
    ps.setInt(2,user.getId());
    int success = ps.executeUpdate();
    if (success==1){
      System.out.println("유저 주소 변경 성공");
    } else {
      System.out.println("유저 주소 변경 실패");
    }
  }

  // 유저 삭제
  public void userDelete(User user) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "Delete from users where id=?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1, user.getId());
    if (ps.executeUpdate() == 1) {
      System.out.println("유저 정보 삭제 성공");
    } else {
      System.out.println("유저 정보 삭제 실패");
    }
    ps.close();
    con.close();
  }

  // 유저 삭제 전 반납여부 확인
  public boolean userCheck(User user) throws SQLException {
    Connection con = LibraryDBConnection.getConnection();
    String sql = "select from users where id=?;";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1,user.getId());
    ResultSet rs = ps.executeQuery();
//    if(rs.getString(9).equals("checkout")){
//      return false;
//    }
//    return true;
    return true;
  }
}
