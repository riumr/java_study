package day12.chapter11;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableDemo {
  public static void main(String[] args) {
    Map<String,Integer> map = new Hashtable<>();

    map.put("김",80); map.put("최",90);
    map.put("우",90); map.put("나",83);

    System.out.print("이름을 입력하세요 : ");
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    System.out.println(map.get(s));
  }
}
