package day11.chapter10;

// 생성자 참조 : 자주 사용되지 않음
public class ConstructorRefDemo {
  public static void main(String[] args) {
    NewArray<Integer> i;
    i = x -> new Integer[x];
    i = Integer[]::new;
  }
}

@FunctionalInterface
interface NewArray<T> {
  T[] getArray(int size);
}