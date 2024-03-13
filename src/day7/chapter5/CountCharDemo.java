package day7.chapter5;

// 지금까지 배운내용 테스트
public class CountCharDemo {
  public static void main(String[] args) {
    // countChar()
    System.out.println(countChar("hello", 'l'));
    System.out.println(countChar("HELLO", 'l'));
    System.out.println(countChar("hello", 'L'));

    // sum()
    System.out.println(sum(1, 2, 3, 4));
    int[] arr = {2, 3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1, 2, 3, 4, 5));
  }

  // 문자열에서 해당하는 문자 개수 구하기
  static int countChar(String s, char c) {
    int cnt = 0;
    s = s.toLowerCase();
    c = Character.toLowerCase(c);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c) cnt += 1;
    }
    ;
    return cnt;
  }

  // 가변길이 매개변수 활용
  static int sum(int i1, int... i2) {
    int num = 0;
    for (int a : i2) num += a;
    return num;
  }

}
