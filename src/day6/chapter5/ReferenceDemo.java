package day6.chapter5;

public class ReferenceDemo {
  public static void main(String[] args) {
    int[] arr = {0};
    increment(arr);
  }
  public static void increment(int[] n){
    System.out.println("before : "+n[0]);
    n[0]++;
    System.out.println("after : "+n[0]);
  }
}
