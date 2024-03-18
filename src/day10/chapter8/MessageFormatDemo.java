package day10.chapter8;

import java.text.MessageFormat;

// MessageFormat 클래스
public class MessageFormatDemo {
  public static void main(String[] args) {
    String java = "java";
    int version = 17;

    String s= MessageFormat.format("lang : {0}, ver : {1}", java, version);
    String s1= MessageFormat.format("lang : {0}, ver : {1}", new Object[]{java,version});
    System.out.println(s);
    System.out.println(s1);
  }
}
