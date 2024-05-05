import java.util.Scanner;

public class Matrixadd {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Rows=");
        int rows = sc.nextInt();
        System.out.println("enter the number of columns");
        int cols = sc.nextInt();

        int number[][] = new int[rows][cols];

        System.out.println("enter the input");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }
    }

}
