package day7.chapter5;

// enum 객체 구현
enum Gender {
  MALE("남성"), FEMALE("여성");

  private final String s;

  Gender (String s) {
    this.s=s;
  }

  // toString 메소드는 class 객체에서는 String type 선언 시 자동으로 호출된다.
  // enum 객체의 경우는 호출해줘야 String 객체 사용시 호출되는 거 같다.
  public String toString(){
    return s;
  }
}
