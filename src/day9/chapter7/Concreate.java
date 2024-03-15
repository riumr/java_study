package day9.chapter7;

// Abstract 구현 클래스.
public class Concreate extends Abstract {
  int i;
  @Override
  void show() {
    System.out.println(i);
  }
  public Concreate(int i1,int i2){
    super(i1);
    this.i=i2;
  }
}
