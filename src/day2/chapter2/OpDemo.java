package day2.chapter2;

public class OpDemo {
  public static void main(String[] args) {
    // 1. 증감연산자 ++, +-;
    int i = 1;
    System.out.println(i);
    i = i + 1;
    System.out.println(i);
    i += 1;
    System.out.println(i);
    i++;
    System.out.println(i);
    i = i-1;
    System.out.println(i);
    i -= 1;
    i--;
    System.out.println(i);

    // 2. 산술연산자 + - * / %(나머지)
    int j = 1 % 2;
    int k = 2 % 2;

    // 3. 비교연산
    boolean b = j<=k;
    System.out.println(b);

    // 4. 논리연산
    // true AND true === true
    boolean b1 = 1 > 0 && 2 < 1;
    System.out.println(b1);
    // true OR ~~~ ==> true
    // false OR false ==> false
    boolean b2 = 1 > 0 || 0 == 1;
    boolean b3 = 1 < 0 || 0 == 1;
    System.out.println(b2);
    System.out.println(b3);
    // not
    boolean b5  = !b3;
    System.out.println(b5);
    // 5. 조건연산 (삼항연산)
    boolean b4 = (1 != 1) ? true : false;
    System.out.println(b4);

    String s = (1 == 1) ? "Hello" : "world";
    System.out.println(s);
  }
}
