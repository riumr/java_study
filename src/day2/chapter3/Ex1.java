package day2.chapter3;

public class Ex1 {
  public static void main(String[] args) {
    // 1부터 100까지의 정수 중 짝수의 총합을 출력하기
    int sum01 = 0;
    int sum02 = 0;
    for (int i=2; i<=100; i+=2){
      sum01+=i;
    }
    for (int j=1; j<=100; j+=1){
      if (j%2==0) {
        sum02+=j;
      }
    }
    System.out.printf("1부터 100까지의 정수 중 짝수의 총합은 %d\n",sum01);
    System.out.printf("1부터 100까지의 정수 중 짝수의 총합은 %d\n",sum02);

    int i=2;
    sum02=0;
    while(i<=100){
      sum02+=i;
      i+=2;
    }
    System.out.printf("1부터 100까지의 정수 중 짝수의 총합은 %d",sum02);
  }
}
