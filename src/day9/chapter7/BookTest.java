package day9.chapter7;

import java.util.Arrays;

// Array.sort() 오름차순
public class BookTest {
  public static void main(String[] args) {
    Book[] books = {
        new Book(15000),
        new Book(30000),
        new Book(25000)
    };

    System.out.println("정렬전");
    for (Book book : books) {
      System.out.println(book);
    }

    Arrays.sort(books);

    System.out.println("정렬후");
    for (Book book : books) {
      System.out.println(book);
    }
  }
}
