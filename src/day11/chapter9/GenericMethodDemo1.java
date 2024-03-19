package day11.chapter9;

// Generic method. 입력받을 type을 명시하지 않아도 된다.
public class GenericMethodDemo1 {
  static class Utils {
    public static <T extends Number> void showArray(T[] a){ // Type 범위 제한
      for (T i : a) {
        System.out.println(i);
      }
    }
    public static <T> T getlast(T[] a){
      return a[a.length -1];
    }
  }


  public static void main(String[] args) {
    Integer[] ia = {1,2,3,4};

    Utils.showArray(ia);
    System.out.println(Utils.getlast(ia));
  }
}
