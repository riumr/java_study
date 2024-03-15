package day9.chapter7;

// 인스턴스를 인터페이스의 정적메소드 매개변수로 활용
public class AnimalDemo {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cukcoo cu = new Cukcoo();

    makeSound(dog);
    makeSound(cu);
  }

  static void makeSound(Animal a){
    a.sound();
  }
}
