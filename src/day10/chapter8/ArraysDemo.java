package day10.chapter8;

import java.util.Arrays;

// Arrays 정적 메소드들
public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j','A','V','A'};
    char[] a2 = Arrays.copyOf(a1,a1.length);
    System.out.println(a1);
    System.out.println(a2);

    String[] s1 = {"케이크","애플","도넛","바나나"};
    print(s1);
    System.out.println(Arrays.binarySearch(s1,"애플"));
    Arrays.fill(s1,2,4,"기타");
    print(s1);
    System.out.println(Arrays.toString(s1));
  }

  private static void print(String[] s1) { //Arrays.toString() 메소드와 동일한 기능을 한다
    for (String s : s1) {
      System.out.print(s + " ");
    }
  }
}
