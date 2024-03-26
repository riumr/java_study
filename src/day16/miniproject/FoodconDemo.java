
package day16.miniproject;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FoodconDemo {
  public static void main(String[] args) throws SQLException {
    Connection con = DBConnection.getConnection();
    Scanner in = new Scanner(System.in);
    System.out.println("1. 식당 2. 수강생 3. 결제");
    int menu = in.nextInt();
    if (menu == 1) {
      System.out.println("식당 추가/수정 작업을 하겠습니다.");
      restManage(in, con);
    } else if (menu == 2) {
      System.out.println("학생 추가/수정 작업을 하겠습니다.");
      studentManage(in, con);
    } else if (menu == 3) {
      System.out.println("결제 정보를 입력해주세요.");
      payment(in, con);
    }
  }

  private static void studentManage(Scanner in, Connection con) throws SQLException {
    System.out.println("1. 추가 2. 수정");
    int subMenu = in.nextInt();
    in.nextLine();
    String name = "";
    int amount = 0;
    int id = 1;
    if (subMenu == 1) {
      System.out.println("추가할 학생의 이름과 금액을 입력하세요");
      name = in.nextLine();
      SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
      String date = formatter.format(new Date());
      amount = in.nextInt();
      StudentDAO.insertStudent(con, name, date, amount);
    } else if (subMenu == 2) {
      System.out.println("수정할 학생 정보를 선택해주세요. 1.이름 2.금액");
      int stuMenu = in.nextInt();
      if (stuMenu == 1) {
        System.out.println("수정을 원하는 학생의 id와 수정할 이름을 입력해주세요 ");
        id = in.nextInt();
        in.nextLine();
        name = in.nextLine();
        StudentDAO.updateStudent(con, id, name);
      } else if (stuMenu == 2) {
        System.out.println("수정할 학생의 id와 수정할 금액을 입력해주세요");
        id = in.nextInt();
        in.nextLine();
        amount = in.nextInt();
        StudentDAO.updateStudent(con, id, amount);
      }
    }
  }

  private static void restManage(Scanner in, Connection con) throws SQLException {
    System.out.println("1. 추가 2. 수정");
    int subMenu = in.nextInt();
    in.nextLine();
    if (subMenu == 1) {
      System.out.println("추가할 식당의 이름을 입력하세요");
      String name = in.nextLine();
      RestaurantsDAO.insertRestaurant(con, name);
    } else if (subMenu == 2) {
      System.out.println("수정할 식당의 id와 수정할 이름을 입력하세요");
      int id = in.nextInt();
      in.nextLine();
      String name = in.nextLine();
      RestaurantsDAO.updateRestaurant(con, id, name);
    }
  }

  private static void payment(Scanner in, Connection con) throws SQLException {
    System.out.println("가게 Id");
    int resId = in.nextInt();
    Restaurants restaurants = RestaurantsDAO.getRestaurant(con,resId);
    in.nextLine();
    System.out.println("학생 Id");
    int studentId = in.nextInt();
    Students students = StudentDAO.getStudent(con,studentId);
    in.nextLine();
    System.out.println("금액");
    int amount = in.nextInt();
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    String date = formatter.format(new Date());
    in.nextLine();
    PaymentDAO.pay(con,restaurants,students,amount,date);
  }
}
