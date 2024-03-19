package day11.chapter9;

// RuntimeException
public class UnCheckedDemo2 {
  public static void main(String[] args) {
    int[] a = {1,2,3};
    // ArrayIndexOutOfBoundsException
    System.out.println(a[4]);
  }
}
