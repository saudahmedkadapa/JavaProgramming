import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n;
        int i;
        int a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n=");
        n = sc.nextInt();
        System.out.println("Fibonacci Series");
        for (i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println("" + a);

        }

    }

}
