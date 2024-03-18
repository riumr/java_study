package day10.chapter8;

// Object 클래스 overriding
public class Mouse {
  String name;

  public Mouse(String name) {
    this.name = name;
  }

}

class Keyboard {
  String name;

  public Keyboard(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Keyboard k){
      if(this.name.equals(k.name)){
        return true;
      };
    }
    return false;
  }

//  @Override
//  public String toString() {
//    return name + "입니다";
//  }
}