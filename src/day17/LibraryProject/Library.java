package day17.LibraryProject;

public class Library {
  private int id;
  private String name;
  private String address;
  private String telephone;
  private String info;

  public Library(int id, String name, String address, String telephone, String info) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.telephone = telephone;
    this.info = info;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getTelephone() {
    return telephone;
  }

  public String getInfo() {
    return info;
  }

  @Override
  public String toString() {
    return "Library ["+id+","+name+","+address+","+telephone+","+info+"]";
  }
}
