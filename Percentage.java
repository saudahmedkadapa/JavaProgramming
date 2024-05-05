import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {
        System.out.println("enter the number 1 ");
        try (Scanner S1 = new Scanner(System.in)) {
            int a = S1.nextInt();
            System.out.println("enter the number 2");
            var S2 = new Scanner(System.in);
            int bn = S2.nextInt();
            int sum = a + bn;
            System.out.println("sum=" + sum);
        }

    }

}
