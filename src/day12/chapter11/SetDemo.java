package day12.chapter11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Collection 인터페이스 set 컬렉션
public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("a","b","c");
    HashSet<String> hashSet = new HashSet<>(set);
    System.out.println(hashSet);
    hashSet.add("a");
    System.out.println(hashSet);

    TreeSet<String> treeSet = new TreeSet<>(set);
    System.out.println(treeSet);
    System.out.println(treeSet.first());
    System.out.println(treeSet.last());
    System.out.println(treeSet.lower("c"));
  }
}
