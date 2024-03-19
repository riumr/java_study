package day11.chapter9;

import java.util.StringTokenizer;

// RuntimeException
public class UnCheckedDemo1 {
  public static void main(String[] args) {
    String s = "time is money";

    StringTokenizer st = new StringTokenizer(s," ,");
    while(st.hasMoreTokens()){
      System.out.println(st.nextToken());
    }
    // NoSuchElementException
    st.nextToken();
  }
}
