package day9.chapter7;

// Comparable 인터페이스 구현 문제. toString 메소드도 사용
public class Triangle implements Comparable {
  int width, height;
  float space;

  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  float space(){
    return space=(float)width*height/2;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Triangle t) {
      if (this.space() > t.space()) {
        return 1;
      } else if (this.space() == t.space()) {
        return 0;
      } else {
        return -1;
      }
    }
    return -2;
  }

  @Override
  public String toString() {
    return "삼각형"+" [width = "+width+","+"height = "+height+","+"넓이 = "+space+"]";
  }
}
