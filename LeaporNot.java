import java.util.Scanner;

public class LeaporNot {
    public static void main(String[] args) {
        Scanner y = new Scanner(System.in);
        System.out.println("enter the year");
        int year = y.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a lear year");

        } else {
            System.out.println(year + " is Not a Leap Year");
        }

    }

}
