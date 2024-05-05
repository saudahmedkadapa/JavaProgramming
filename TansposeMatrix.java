import java.util.Scanner;

public class TansposeMatrix {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Rows:");
        int row = sc.nextInt();
        System.out.println("enter the number of columns");
        int col = sc.nextInt();
        System.out.println("enter the Matrix");
        int[][] transpose = new int[row][col];
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                transpose[i][j] = sc.nextInt();

            }
            System.out.println();
        }
        System.out.println("the transpose of the given matrix:\n");
        for (j = 0; j < col; j++) {
            for (i = 0; i < row; i++) {
                System.out.println(transpose[i][j] + " ");
            }
            System.out.println();

        }

    }

}
