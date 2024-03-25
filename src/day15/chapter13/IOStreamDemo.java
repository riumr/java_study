package day15.chapter13;

import java.io.IOException;

// read(), write() 메소드로 입력 및 출력
// 바이트 단위의 이진 데이터를 다루므로 이미지나 동영상 파일을 처리할 때 유용
public class IOStreamDemo {
  public static void main(String[] args) throws IOException {
    System.out.println("--- 입력스트림 ---");
    int[] readByte = new int[100];
    int read;
    int len = 0;
    read=System.in.read();
    while(read!='\n'){
      System.out.printf("%c(%d)",(char)read,read);
      readByte[len++]=read;
      read=System.in.read(); // 입력
    }
    System.out.println(read);

    System.out.println("--- 출력스트림 ---");
    for (int i = 0; i < len; i++) {
      System.out.write(readByte[i]); // 출력
    }
    System.out.flush();
    System.out.close();
  }
}
