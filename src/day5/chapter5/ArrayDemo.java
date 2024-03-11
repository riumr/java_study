package day5.chapter5;

public class ArrayDemo {
  public static void main(String[] args) {
//    int scores[] = new int[5];
//    for (int i = 0; i < 5; i++) {
//      scores[i]=100;
//      System.out.println(scores[i]);
//    }

    int[] scores = {100, 90, 80, 70, 60};
    int[] scores1;
    scores1 = new int[]{100,90,80,70,60};

    System.out.println("세번째 학생의 점수는 "+scores[2]+"입니다");

    scores[2] = 85;

    System.out.println("세번째 학생의 점수는 "+scores[2]+"입니다");
    System.out.println(scores.length);
  }
}
