package day10.chapter8;

import java.util.Arrays;

// System class 메소드들
// currentTimeMills(), nanoTime(), arraycopy()
public class SystemDemo {
  public static void main(String[] args) {
    int[] src = new int[] {1,2,3,4,5,6};
    int[] dst = {10,20,30,40,50,60,70};

    System.out.println(System.currentTimeMillis());
    System.out.println(System.nanoTime());
    System.arraycopy(src,0,dst,0,3);
    System.out.println(Arrays.toString(dst));
    System.out.println(System.currentTimeMillis());
    System.out.println(System.nanoTime());
  }
}
