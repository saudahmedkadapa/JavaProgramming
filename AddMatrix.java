public class AddMatrix {
    public static void main(String[] args) {
        int m1[][] = { { 1, 2, 3 }, { 2, 5, 7 }, { 6, 8, 9 } };
        int m2[][] = { { 5, 4, 3 }, { 6, 1, 3 }, { 4, 7, 9 } };
        int sum[][] = new int[3][3];
        int i, j;
        System.out.println("Elements of first matrix=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(m1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Elements of Second Matrix =");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(m2[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Addition of two Matrix=");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }

        }
        // sum of two matrix
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

}
