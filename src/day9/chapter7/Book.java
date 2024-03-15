package day9.chapter7;

// Comparable 구현 클래스 Book
public class Book implements Comparable{
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book [price ="+price+"]";
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Book b){
      return this.price - b.price;
    }
    return -999;
  }
}
