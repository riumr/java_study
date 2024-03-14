package day8.chapter6;

// 객체 override 실습. instanceof 활용
public class PersonalNumber {
  String country;
  int pNumber;

  public PersonalNumber(String country, int pNumber) {
    this.country = country;
    this.pNumber = pNumber;
  }

  @Override
  public boolean equals(Object obj) {
    return (obj instanceof PersonalNumber p) && p.pNumber==pNumber;
  }
}
