package day8.chapter6;

public class Person {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  String show(){
    return "이름 : "+name+" 나이 : "+age;
  }

  public Person(String name,int age){
    this.name=name;
    this.age=age;
  }

  public Person(){

  }
}
