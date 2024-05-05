// Q.Write a program in Java to display the n terms of odd natural number and their sum

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("enter the number");
        try (Scanner r = new Scanner(System.in)) {
            n = r.nextInt();
        }

        for (int i = 1; i <= n; i = i + 2) {
            System.out.println(i);
            sum = sum + i;

        }
        System.out.print("Sum of all odd numbers between 0 to " + n + " = " + sum);
    }

}
