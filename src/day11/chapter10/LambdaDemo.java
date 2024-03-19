package day11.chapter10;

// lambda 식은 Myfunction 인터페이스를 구현한 익명객체의 method를 overridng하는 원리로 만들어진다.
public class LambdaDemo {
  public static void main(String[] args) {
//    Object obj = new Object(){
//      int max(int a, int b){
//        return a>b ? a:b;
//      }
//    };
    Myfunction f= new Myfunction() {
      @Override
      public int max(int a, int b) {
        return a>b?a:b;
      }
    };
    System.out.println(f.max(2,3));
  }
}
@FunctionalInterface
interface Myfunction {
  public abstract int max(int a,int b);
}

class Annonymus implements Myfunction {
  @Override
  public int max(int a, int b) {
    return 0;
  }
}