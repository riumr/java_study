package day12.chapter11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Map 인터페이스 HashMap 클래스
// put으로 넣는다.
// get으로 key에 해당하는 값을 찾는다.
public class HashMapDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> map = new HashMap<>();
    map.put(new Fruit("사과"), 4);
    map.put(new Fruit("바나나"), 3);
    map.put(null, 6);
    System.out.println(map);
    map.put(new Fruit("사과"), 5);
    System.out.println(map);
    Set<Fruit> fruits = map.keySet();
    System.out.println(fruits);
    Collection<Integer> values = map.values();
    System.out.println(values);
  }
}

class Fruit {
  String name;


  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name + "";
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Fruit f){
      return this.name.equals(f.name);
    }
    return false;
  }
}
