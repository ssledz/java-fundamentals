package pl.softech.learning;

public class PrintNumbers {

  public static void print(int a, int b) {

    for (int i = a; i <= b; i++) {
      if (i % 2 == 0 && i % 3 == 0) {
        System.out.println("BisCis: " + i);
      } else if (i % 2 == 0) {
        System.out.println("Bis: " + i);
      } else if (i % 3 == 0) {
        System.out.println("Cis: " + i);
      }
    }

  }

  public static void main(String[] args) {
    print(1, 20);
  }
}
