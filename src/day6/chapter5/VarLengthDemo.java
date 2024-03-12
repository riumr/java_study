package day6.chapter5;

// 가변개수 인수 구현
public class VarLengthDemo {
  public static void main(String[] args) {
    sumAndPrint(1,2,3);
  }
  public static void sumAndPrint(int...v){
    int sum = 0;
    for (int i : v) {
      sum+=i;
    }
    System.out.println(sum);;
  }
}
