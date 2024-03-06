package day2.chapter2;

public class OpDemo4 {
  public static void main(String[] args) {
    int i = 3;
    System.out.println("연산 전 : " + i);
    int j = i++;
    System.out.println("연산 후 i : " + i);
    System.out.println("연산 후 j : " + j);
  }
}
