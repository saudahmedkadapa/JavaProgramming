import java.util.Scanner;

public class MAtrix1 {
    public static void main(String[] args) {
        int i, j;
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = a.nextInt();

        System.out.println("enter the number columns");
        int cols = a.nextInt();

        int number[][] = new int[rows][cols];

        System.out.println("enter the input");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                number[i][j] = a.nextInt();
            }
            System.out.println("MATRIX");
            for (i = 0; i < rows; i++) {
                for (j = 0; j < cols; j++) {
                    System.out.println(number[i][j] + " ");
                }
                System.out.println();

            }
        }

    }
}
