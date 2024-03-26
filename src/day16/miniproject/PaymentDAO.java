package day16.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class PaymentDAO {
  public static void pay(Connection con, int amount,String date) throws SQLException {
    System.out.println("해당금액을 결제하겠습니다");
    String sql = "insert into payments (resId, studentId, date, amount) values (?,?,?,?);";
    PreparedStatement statement = con.prepareStatement(sql);
    statement.setInt(1,1);
    statement.setInt(2,1);
    statement.setDate(3,java.sql.Date.valueOf(date));
    statement.setInt(4,amount);
    if(statement.executeUpdate()==1){
      System.out.println("결제 성공");
    } else {
      System.out.println("결제 실패");
    }
    statement.close();
    con.close();
  }
}
