package day7.chapter6;

public class ChessDemo {
  public static void main(String[] args) {
    WorldChess worldChess = new WorldChess();
    System.out.println(worldChess.getFirstPlayer());
  }
}

class Chess {
  enum ChessPlayer {
    White, Black
  }
  // final 객체는 overriding이 안 된다.
  final ChessPlayer getFirstPlayer() {
    return ChessPlayer.Black;
  }
}

class WorldChess extends Chess {

}