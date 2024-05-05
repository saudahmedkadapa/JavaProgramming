public class Resultantmatrix {
    public static void main(String[] args) {
        int a, b;
        int c[][] = new int[2][3];
        System.out.print("resultant Matrix ");
        System.out.println();
        // adding and printing addition of 2 matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();// new line
        }

    }

}
