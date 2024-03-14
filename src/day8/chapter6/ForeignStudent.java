package day8.chapter6;

public class ForeignStudent extends Student {
  private String country;

  public ForeignStudent(String name, int age, int studentId, String country) {
    super(name,age,studentId);
    this.country = country;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public ForeignStudent() {

  }

  @Override
  String show() {
    return "이름 : "+getName()+" 나이 : "+getAge()+" 학번 : "+getStudentId()+" 국적 : "+country;
  }
}
