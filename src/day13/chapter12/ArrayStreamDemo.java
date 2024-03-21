package day13.chapter12;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// stream을 생성하는 방법들
public class ArrayStreamDemo {
  public static void main(String[] args) {
    int[] ia = {2,3,5,7,11,13};
    IntStream is = Arrays.stream(ia);
    IntStream ia1 = IntStream.of(ia);

    String[] strings = {"The","pen","is","mighter","than","the","sword"};
    Stream<String> ss = Stream.of(strings);

    double[] da = {1.2, 3.14, 5.8, 0.2};
    Stream<double[]> da1 = Stream.of(da);
    DoubleStream ds = DoubleStream.of(da);
  }
}
