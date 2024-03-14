package day8.chapter6;

// override한 메소드 테스트
public class PeopleNumberDemo {
  public static void main(String[] args) {
    PersonalNumber p1 = new PersonalNumber("korea",12345);
    PersonalNumber p2 = new PersonalNumber("korea",13234);

    System.out.println(p1.equals(p2));
  }
}
