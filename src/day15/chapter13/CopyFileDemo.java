package day15.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// FileStream 클래스. 모든 파일을 읽고 쓸 수 있음
public class CopyFileDemo {
  public static void main(String[] args) {
    String input = "C:\\Temp\\org.txt";
    String output = "C:\\Temp\\target.txt";
    int read;
    try {
      FileInputStream fis = new FileInputStream(input);
      FileOutputStream fos = new FileOutputStream(output);
      while((read = fis.read()) != -1){
        fos.write(read);
      }
    } catch (FileNotFoundException e) {
      System.out.println("해당 파일을 찾을 수 없습니다");
    } catch (IOException e){
      throw new RuntimeException(e);
    }
  }
}
