package day15.chapter18;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

// Socket 클래스를 사용한 Client
public class SimpleClient {
  public static void main(String[] args) {
    try {
      Socket client = new Socket("localhost", 5000);
      OutputStream os = client.getOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(os);
      oos.writeObject("안녕, 단순 서버야");
      oos.flush();
    } catch (Exception e) {
    }
  }
}
