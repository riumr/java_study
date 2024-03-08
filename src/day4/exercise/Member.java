package day4.exercise;

public class Member {
  // 13.
  // 현실 세계의 회원을 Member 클래스로 모델링 하려고 한다.
  // 회원의 데이터는 이름, 아이디, 패스워드, 나이가 있다.
  // 이 데이터를 가지는 Member 클래스를 선언하라.
  private String name, id, password;
  private int age;

  public Member(String name, String id) {
    this.name = name;
    this.id = id;
  }

  // 15.
  boolean logIn(String id, String password){
    if (id.equals("hong") && password.equals("12345")){
      return true;
    }
    return false;
  }
  boolean logOut(String id){
    if (id.equals("hong")){
      return true;
    }
    return false;
  }
}
