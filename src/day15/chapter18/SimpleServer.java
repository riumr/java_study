package day15.chapter18;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

// Socket 클래스로 만든 Server
public class SimpleServer {
  public static void main(String[] args) {
    try {
      ServerSocket server = new ServerSocket(5000);
      Socket connection = server.accept();
      InputStream is = connection.getInputStream();
      ObjectInputStream ois = new ObjectInputStream(is);
      String s = (String) ois.readObject();
      System.out.println("받은 문자열 : "+s);
    } catch (Exception e) {

    }
  }
}
