import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        int a;
        int b;

        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter a Number\n");
            a = obj.nextInt();
            b = obj.nextInt();
        }
        System.out.print(a);
        System.out.print(b);
    }

}
