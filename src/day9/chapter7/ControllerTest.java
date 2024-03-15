package day9.chapter7;

// 추상 클래스 테스트
public class ControllerTest {
  public static void main(String[] args) {
    Controller[] c= {
        new TV2(false),
        new Radio(true)
    };
    for (Controller controller : c) {
      controller.show();
    }
  }
}
class TV2 extends Controller{

  private String name = "TV";

  @Override
  String getName() {
    return name;
  }

  public TV2(boolean power) {
    super(power);
  }

}

class Radio extends Controller {

  private String name = "Radio";

  @Override
  String getName() {
    return name;
  }

  public Radio(boolean power) {
    super(power);
  }
}