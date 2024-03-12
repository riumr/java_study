package day6.chapter5;

public class ForEachDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int sumEven = 0;
    int sumOdd = 0;
    for (int x: arr){
      if (x%2==0){
        sumEven+=x;
      } else {
        sumOdd+=x;
      }
    }
    System.out.println("짝수의 합 : "+sumEven);
    System.out.println("홀수의 합 : "+sumOdd);
  }
}
