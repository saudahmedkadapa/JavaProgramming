import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int i, j;
        String m = "ABCD";
        int n = m.length();
        System.out.println("****enter the number of lines");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        for (i = 0; i < p; i++) {
            for (j = 0; j <= i; j++) {
                System.out.println(m.charAt(i + j));

            }
            System.out.println();

        }

    }
}
