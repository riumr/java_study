package day13.chapter12;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// partioning. 이분법
public class PartitionDemo {
  public static void main(String[] args) {
    Stream<Nation> sn = Nation.nations.stream();
    Map<Boolean, Long> collect = sn.collect(Collectors.partitioningBy(
        n -> n.getType() == Nation.Type.LAND,
        Collectors.counting()
    ));
    System.out.println(collect);
  }
}
