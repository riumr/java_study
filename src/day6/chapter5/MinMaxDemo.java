package day6.chapter5;

import java.util.Arrays;

public class MinMaxDemo {
  public static void main(String[] args) {
    float[] fArr = {2.0f, 10.2f, 3.5f, 4.1f, 1.0f};
    float max = fArr[0];
    float min = fArr[0];
    for (int i = 0; i < fArr.length; i++) {
      if(fArr[i] > max) max=fArr[i];
      if(fArr[i] < min) min=fArr[i];
    }
    System.out.println("최대값 : "+max);
    System.out.println("최솟값 : "+min);

    // 배열을 Arrays.sort로 변환하는 방법
    // Arrays.sort()
    // 맨 앞의 값이 최솟값, 맨 뒤의 값이 최댓값
    Arrays.sort(fArr);
    System.out.println("최솟값 : "+fArr[0]);
    System.out.println("최댓값 : "+fArr[fArr.length-1]);


  }
}
