import java.util.Scanner;

public class Matrix4 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner r = new Scanner(System.in);
        System.out.println("enter the  array elemnets:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
            System.out.println();
        }
        System.out.println("matrix:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
