import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a = sc.nextInt();
        System.out.println("variable value= " + a);
    }

}