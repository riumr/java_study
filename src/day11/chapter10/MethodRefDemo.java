package day11.chapter10;

// 정적 메서드 참조
public class MethodRefDemo {
  public static void main(String[] args) {
    Mathemetical m;
    // m = d->Math.abs(d);
    m = Math::abs;
    System.out.println(m.caculate(-1));
  }
}

@FunctionalInterface
interface Mathemetical{
  double caculate(double d);
}