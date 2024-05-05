import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the values=");
        try {
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
            int num = a / (b - c);
            System.out.println(a + " /" + (b - c) + "=" + num);
        } catch (ArithmeticException ae) {
            System.out.println("Problem Info : Value of Divisor can not be a Zero");
        }
    }

}
