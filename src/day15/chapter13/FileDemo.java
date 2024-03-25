package day15.chapter13;

import java.io.File;

// File class 정적 메소드
// 파일 연산을 수행할 때 유용하다
public class FileDemo {
  public static void main(String[] args) {
    File file = new File("C:\\Windows");
    File[] files = file.listFiles();
    for (File file1 : files) {
      if (file1.isDirectory()) {
        System.out.printf("dir : %s\n",file1);
      }else{
        System.out.printf("file : %s(%d bytes)\n",file1,file1.length());
      }
    }
  }
}
