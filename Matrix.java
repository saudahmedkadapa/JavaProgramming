import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of ROWS=");
    int rows = sc.nextInt();

    System.out.println("enter the number of columns");
    int cols = sc.nextInt();

    int number[][] = new int[rows][cols];

    System.out.println("enter the inputs");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        number[i][j] = sc.nextInt();
      }
    }
    System.out.println("output");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        System.out.println(number[i][j] + " ");
      }
      System.out.println();
    }
  }

}
