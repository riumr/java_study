package day2.chapter2;

public class OpDemo5 {
  public static void main(String[] args) {
    int x, y, z;
    x = y = z = 3;

    z = x++ + --y * x ;
    /* 1) z = x; res1 = 3
       2) x++; 4
       3) --y; 2
       4) res2 = y * x; 0
       5) res1 + (res2)
    */
    System.out.println(z);

//    y = (x == 1) ? 10 : x++;
//    System.out.println(y);

    String s = (x > 1) ? "false" : "hello world";
    System.out.println(s);
  }
}
