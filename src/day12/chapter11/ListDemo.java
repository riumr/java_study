package day12.chapter11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Collection 인터페이스 List collection(Array->list)
// 인덱스 기반 수정, 정렬 등 가능
public class ListDemo {
  public static void main(String[] args) {
    String[] animals1 = {"사슴","호랑이","바다표범","곰"};
    // List collection 생성
    List<String> animalList = Arrays.asList(animals1);
    // iterator
    Iterator<String> animalIterator = animalList.iterator();
    while (animalIterator.hasNext()){
      System.out.print(animalIterator.next()+" ");
    }
    System.out.println();
    animalList.set(1,"앵무새");
    for (String s : animalList) {
      System.out.print(s+" ");
    }
    System.out.println();

    animalList.sort((x,y)->x.length()-y.length());
    System.out.print(animalList);
    System.out.println();

    // 다시 배열로
    String[] animalArray = animalList.toArray(new String[4]);
    for (String s : animalArray) {
      System.out.print(s+" ");
    }
    List<String> aList = List.of("a","b","c");
//    aList.set(0,"f");
    aList.forEach(s -> System.out.print(s));
    aList.forEach(System.out::print);
  }
}
