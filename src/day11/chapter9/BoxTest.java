package day11.chapter9;

// Generic class 사용
public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf(100));
    System.out.println( i.get());

    Box<String> s = new Box<>();
    s.set("만능이네");
    System.out.println(s.get());
  }
}

// Generic class 생성
class Box<T>{
  private T item;
  public void set(T item){
    this.item=item;
  }
  public T get(){
    return item;
  }
}
