package day8.chapter6;

public class Student extends Person{
  private int studentId;

  public Student(String name, int age, int studentId){
    super(name,age);
    this.studentId=studentId;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public Student(){
  }

  @Override
  String show() {
    return "이름 : "+getName()+" 나이 : "+getAge()+" 학번 : "+studentId;
  }
}
