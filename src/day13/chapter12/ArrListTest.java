package day13.chapter12;

// 구현한 arrList 테스트
public class ArrListTest {
  public static void main(String[] args) {
    ArrList<Integer> al = new ArrList<>();
    al.add(10);
    System.out.println(al.size());
    System.out.println(al.get(0));
    al.add(20);
    System.out.println(al.size());
    al.add(30);
    System.out.println(al.size());
    al.add(40);
    System.out.println(al.get(3));

    for (int i = 0; i <4; i++) {
      System.out.println(al.get(i));
    }
    System.out.println(al.removeLast());
  }
}
