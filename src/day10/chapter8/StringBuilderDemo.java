package day10.chapter8;

// 변경될 수 있는 문자열은 String 클래스보다 StringBuilder 클래스 사용
// StringBuilder는 같은 주소값의 객체를 수정할 수 있도록 하기 때문이다
public class StringBuilderDemo {
  public static void main(String[] args) {
    String s = "hi";
    System.out.println(s.hashCode());
    s+="i";
    System.out.println(s.hashCode());

    StringBuilder sb = new StringBuilder("hi");
    System.out.println(sb.hashCode());
    sb.append("!");
    System.out.println(sb);
    System.out.println(sb.hashCode());
    System.out.println(sb.capacity());
    sb.append("1243");
    System.out.println(sb.capacity());
    System.out.println(sb.replace(0,2,"hello").delete(0,6));
  }
}
