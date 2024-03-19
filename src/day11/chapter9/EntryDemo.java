package day11.chapter9;

// 2개 이상의 매개변수를 가지는 Generic type 테스트
public class EntryDemo {
  public static void main(String[] args) {
    Entry<String, Integer> e1 = new Entry<>("Hong",27);
    Entry<String, String> e2 = new Entry<>("son","hm");

    System.out.println(e1.getKey()+" "+e1.getValue());
    System.out.println(e2.getKey()+" "+e2.getValue());

    Entry e3 = new Entry<>(1,2);
  }
}
