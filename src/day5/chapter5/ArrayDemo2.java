package day5.chapter5;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int[] arr;
    arr= new int[]{1, 2, 3, 4, 5};
    System.out.println(arr);

    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if(i == arr.length -1){
        System.out.print(arr[i]);
      }
      else{
        System.out.print(arr[i]+",");
      }
    }
    System.out.println("]");

    System.out.println(Arrays.toString(arr));
  }
}
