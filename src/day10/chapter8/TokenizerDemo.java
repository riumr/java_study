package day10.chapter8;

import java.util.StringTokenizer;

// StringTokenizer 클래스의 메소드들
public class TokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";

    StringTokenizer st = new StringTokenizer(s," ,");
    System.out.println(st.countTokens());
    while (st.hasMoreTokens()){
      System.out.print("["+st.nextToken()+"]");
    }
  }
}
