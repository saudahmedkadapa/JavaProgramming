
// Q.Create Java Program for simple calculator with user input .

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1, n2;
        int op, cal;
        System.out.println("enter two numbers=");
        try (Scanner R = new Scanner(System.in)) {
            n1 = R.nextInt();
            n2 = R.nextInt();
            System.out.println("select operation");
            op = R.nextInt();
        }
        if (op == 1) {

            cal = n1 + n2;
            System.out.println("ADDITION=" + cal);

        } else if (op == 2) {
            cal = n1 - n2;
            System.out.println("SUBSTRACTION=" + cal);

        } else if (op == 3) {
            cal = n1 * n2;
            System.out.println("MULTIPLICATION=" + cal);
        } else if (op == 4) {
            cal = n1 / n2;
            System.out.println("DIVISION=" + cal);
        } else {
            cal = n1 % n2;
            System.out.println("Remander=" + cal);
        }

    }

}
