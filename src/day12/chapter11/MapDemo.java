package day12.chapter11;

import java.util.HashMap;
import java.util.Map;

// Map 인터페이스 객체 구현
public class MapDemo {
  public static void main(String[] args) {
    Map<String,Integer> fruits = Map.of("사과",5,"바나나",3,"딸기",2);
    System.out.println(fruits.size()+"종류의 과일이 있다");
    System.out.println(fruits);

    // HashMap 클래스
    HashMap<String,Integer> hashMap = new HashMap<>(fruits);
    System.out.println(hashMap.size());
    hashMap.put("사과",3);
    System.out.println(hashMap);
    hashMap.put("apple",3);
    System.out.println(hashMap);;
  }
}
