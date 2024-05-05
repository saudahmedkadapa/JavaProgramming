import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("OPen files");
            int n = sc.nextInt();
            System.out.println("n= " + n);
            int a = 45 / n;
            System.out.println("a=" + a);
        } catch (ArithmeticException ae) {

            System.out.println(ae);

        } finally {
            System.out.println("close files");
        }
    }

    public void getStackTrace() {
    }

    public void printStackTrace() {
    }

}
