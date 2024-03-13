package day7.chapter5;

public class EnumDemo {
  public static void main(String[] args) {
    Gender gender = Gender.MALE;
    Gender gender1 = Gender.FEMALE;
    if (gender == Gender.MALE) {
      System.out.println(gender + "은 병역 의무가 있다.");
    } else {
      System.out.println(gender + "은 병역 의무가 없다");
    }
    // enum 객체 메소트 테스트
    System.out.println(gender.name());
    System.out.println(Gender.valueOf(gender.name()));
    System.out.println(gender.ordinal());

  }
}
