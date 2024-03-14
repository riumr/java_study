package day8.chapter6;

public class Smartphone extends Telephone{
  private String game;

  void playGame(){
    System.out.println(owner+"가 "+game+" 중");
  }

  public Smartphone(String owner,String game){
    super(owner,""); // super로 호출시 모든 필드를 정의해줘야 한다
    this.game=game;
  }

  public Smartphone(){

  }
}
