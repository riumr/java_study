package day3.chapter3;

public class MethodDemo1 {
  public static void main(String[] args) {
    // 메소드 호출
    sumAndPrint(1,10);
    sumAndPrint(10,100);
    sumAndPrint(100,1000);
  }

  // 메소드 선언
  public static void sumAndPrint(int num1, int num2){
    int sum = 0;
    for (int i = num1; i <= num2; i++) {
      sum += i;
    }
    System.out.printf("%d~%d 까지의 합 : %d\n",num1,num2,sum);
  }
}
