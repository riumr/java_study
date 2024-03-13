package day7.chapter6;

// 상속 관계 확인
public class ParentChildDemo {
  public static void main(String[] args) {
    Parent parent = new Parent();
    System.out.println(parent.field1);
    parent.method1();

    Child child = new Child();
    System.out.println(child.field2);
    child.method2();
  }
}
