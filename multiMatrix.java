public class multiMatrix {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = { { 5, 2, 3 }, { 2, 6, 3 }, { 6, 9, 1 } };
        int[][] b = { { 2, 7, 5 }, { 1, 4, 3 }, { 1, 2, 1 } };
        int[][] c = new int[n][n];
        System.out.println("Matrix 1:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix 2 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
