package day13.chapter12;

import java.util.NoSuchElementException;

// ArrayList 직접 구현하기
// 배열의 원리 : overflow가 발생하면 배열의 크기를 2배 증가시킨다.
//           : 배열이 1/4 남아있다면 크기를 1/2로 줄인다.

public class ArrList<E> {
  private E[] a;
  private int size;

  public ArrList() {
    a = (E[]) new Object[2];
    size = 0;
  }
  // get, add, remove 메서드를 선언

  public E get(int Index) {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return a[Index];
  }

  public E removeLast() {
    if (size == a.length/4){
      resize(a.length/2); // 1/2로 줄인다
    }
    E ret = a[size - 1];
    a[size - 1] = null; // 이전 마지막 요소 null
    return (E) a[a.length - 1]; // 이후 마지막 요소 반환
  }

  public void add(E v) {
    if (a.length == size) {
      resize(a.length * 2); // 2배로 늘린다
    }
    a[size] = v; // 추가된 요소는 a의 마지막 칸에 들어간다.
    size++; // 요소가 추가되면 size는 1 증가한다.
  }

  private void resize(int newSize) {
    Object[] t = new Object[newSize];
    for (int i = 0; i < size; i++) {
      t[i] = a[i];
    }
    a = (E[]) t; // 사이즈만큼 늘려서 a에 할당한다.
  }

  public int size(){
    return size;
  }
}
