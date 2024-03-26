package day16.miniproject;

public class Payment {
  private int id;
  private int resId;
  private int studentId;
  private String date;
  private int amount;

  public Payment(int id, int resId, int studentId, String date, int amount) {
    this.id = id;
    this.resId = resId;
    this.studentId = studentId;
    this.date = date;
    this.amount = amount;
  }

  public int getId() {
    return id;
  }

  public int getResId() {
    return resId;
  }

  public int getStudentId() {
    return studentId;
  }

  public String getDate() {
    return date;
  }

  public int getAmount() {
    return amount;
  }
}
