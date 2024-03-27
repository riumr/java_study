package day17.LibraryProject;

public class Book {
  private int id;
  private int libraryId;
  private String bookName;
  private String writerName;
  private String publisher;
  private String classifier;
  private String isbn;
  private String kubun;
  private String status;

  public Book(int id, int libraryId, String bookName, String writerName, String publisher, String classifier, String isbn, String kubun, String status) {
    this.id = id;
    this.libraryId = libraryId;
    this.bookName = bookName;
    this.writerName = writerName;
    this.publisher = publisher;
    this.classifier = classifier;
    this.isbn = isbn;
    this.kubun = kubun;
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public int getLibraryId() {
    return libraryId;
  }

  public String getBookName() {
    return bookName;
  }

  public String getWriterName() {
    return writerName;
  }

  public String getPublisher() {
    return publisher;
  }

  public String getClassfier() {
    return classifier;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getKubun() {
    return kubun;
  }

  public String getStatus() {
    return status;
  }

  @Override
  public String toString() {
    return "Book["+id+","+"]";
  }
}
