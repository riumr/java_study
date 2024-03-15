package day9.chapter7;

// Java 내장 인터페이스 클래스에 구현
public class Line implements Comparable {
  int length;

  public Line(int length) {
    this.length = length;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Line l) {
      if (this.length > l.length) return 1;
      else if (this.length == l.length) return 0;
      else return -1;
    }
    return -2;
  }

  @Override
  public String toString() {
    return "length :"+length;
  }
}
