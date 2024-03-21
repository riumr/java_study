package day13.chapter12;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

// Optional 타입으로 반환
public class OptionalDemo {
  public static void main(String[] args) {
    OptionalInt i = OptionalInt.of(10);
    OptionalDouble d = OptionalDouble.of(3.14);
    Optional<String> s = Optional.of("apple");

    Util.print(i);
    Util.printWithParenthesisLn(i.getAsInt());
    Util.print(d);
    Util.printWithParenthesisLn(d.getAsDouble());
    Util.print(s);
    Util.printWithParenthesisLn(s.get());

    // Optional type 메서드 반환 값 확인
    System.out.println(divide(1.0,2.0).getAsDouble());
    System.out.println(divide(1.0,0));
    System.out.println(divide(1.0,0).isEmpty());

    // ofNullable
    System.out.println(Optional.ofNullable("a"));
    System.out.println(Optional.ofNullable(null));

    // orElse
    System.out.println(Optional.ofNullable("a").orElse("null"));
    System.out.println(Optional.ofNullable(null).orElse("null"));

  }

  static OptionalDouble divide(double x, double y) {
    return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
  }
}
