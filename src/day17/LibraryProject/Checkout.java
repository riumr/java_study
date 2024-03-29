package day17.LibraryProject;

import java.util.Date;

public class Checkout {
  public Checkout(Integer id, int libraryId, int bookId, int userId, Date checkoutDate, Date returnDate, boolean renewed, Date renewReturnDate, Date checkinDate) {
    this.id = id;
    this.libraryId = libraryId;
    this.bookId = bookId;
    this.userId = userId;
    this.checkoutDate = checkoutDate;
    this.returnDate = returnDate;
    this.renewed = renewed;
    this.renewReturnDate = renewReturnDate;
    this.checkinDate = checkinDate;
  }

  private Integer id;
  private int libraryId;
  private int bookId;
  private int userId;
  private Date checkoutDate;
  private Date returnDate;
  private boolean renewed;
  private Date renewReturnDate;
  private Date checkinDate;

  public int getId() {
    return id;
  }

  public int getLibraryId() {
    return libraryId;
  }

  public int getBookId() {
    return bookId;
  }

  public int getUserId() {
    return userId;
  }

  public Date getCheckoutDate() {
    return checkoutDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public boolean isRenewed() {
    return renewed;
  }

  public Date getRenewReturnDate() {
    return renewReturnDate;
  }

  public Date getCheckinDate() {
    return checkinDate;
  }

  @Override
  public String toString() {
    return "checkout ["+id+","+libraryId+","+bookId+","+userId+","+checkoutDate+","+returnDate+"]";
  }
}
