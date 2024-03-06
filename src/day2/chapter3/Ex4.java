package day2.chapter3;

public class Ex4 {
  public static void main(String[] args) {
    // 2. switch 문 표현식으로 바꾸기
    String grade="";
    int score1 = 0;
    if (grade=="A"){
      score1=100;
      if (grade=="B"){
        int result=100-20;
        score1=result;
      }
    } else {
      score1=60;
    }
    System.out.println(score1);
  }
}
