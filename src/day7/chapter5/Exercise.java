package day7.chapter5;

// enum 객체 사용 실습
public class Exercise {
  public static void main(String[] args) {
    // 1. 월~일요일까지의 상수값을 가지는 enum class를 생성
    // 2. 1.에서 만든 enum 타입의 (요일을 가리키는) 변수를 선언하고 수요일로 초기화
    WeekDay day = WeekDay.WED;
    // 3. 2의 변수를 이용해 오늘이 무슨 주중인지 주말인지 출력
    switch (day){
      case MON, TUE, WED, THU, FRI:
        System.out.println("주중입니다");
        break;
      case SAT,SUN:
        System.out.println("주말입니다.");
        break;
    }
  }
}
