package day17.LibraryProject;

public class User {
  private int id;
  private int libraryId;
  private String username;
  private String telephone;
  private String address;
  private int point;

  public User(int id, int libraryId, String username, String telephone, String address, int point) {
    this.id = id;
    this.libraryId = libraryId;
    this.username = username;
    this.telephone = telephone;
    this.address = address;
    this.point = point;
  }

  public int getId() {
    return id;
  }

  public int getLibraryId() {
    return libraryId;
  }

  public String getUsername() {
    return username;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getAddress() {
    return address;
  }

  public int getPoint() {
    return point;
  }
}
