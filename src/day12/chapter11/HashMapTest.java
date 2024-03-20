package day12.chapter11;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
  public static void main(String[] args) {
    Map<String,String> animalMap = Map.of("호랑이","tiger","표범","leopard","사자","tiger");
    Map<String,String> animals = new HashMap<>(animalMap);
    System.out.println("변경 전"+animals);
    animals.replaceAll((a,b)->b.toUpperCase());
    System.out.println("변경 후"+animals);
  }
}
