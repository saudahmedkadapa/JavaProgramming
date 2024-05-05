import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        System.out.println("before swaping number:" + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping number:" + a + " " + b);
    }

}
