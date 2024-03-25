package day15.chapter18;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

// InetAddress 클래스
// DNS, localhost의 ip주소 가져오기
public class InetAddressDemo {
  public static void main(String[] args) {
    InetAddress[] addr1 = null;
    InetAddress addr2 = null;
    System.out.println("호스트 이름을 입력하세요 : ");
    Scanner in = new Scanner(System.in);
    String url = in.nextLine();

    try {
      addr1 = InetAddress.getAllByName(url);
      addr2 = InetAddress.getLocalHost();
    } catch (UnknownHostException e) {
      throw new RuntimeException(e);
    }
    System.out.println(url+"의 IP 주소");
    for (InetAddress addr : addr1) {
      System.out.println(addr);
    }
    System.out.println("localhost의 IP주소");
    System.out.println(addr2.getHostAddress());
  }
}
