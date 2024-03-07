package day3.chapter4;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p1;
    p1 = new Phone();
    p1.model = "S24";
    p1.value = 140;
    p1.print();
    System.out.println(p1); // 참조변수 p1의 주소를 보여준다.

    Phone p2 = new Phone();
    p2.model = "iPhone";
    p2.value = 200;
    p2.print();
    System.out.println(p2);

    p1=p2;
    p1.print();
  }
}
