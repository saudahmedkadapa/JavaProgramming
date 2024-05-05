import java.io.*;
import java.util.Scanner;
import java.lang.*;

class Fibonacci extends Thread {
    public void run() {
        try {
            int a = 0, b = 1, c = 0;
            // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Limit for fabonacci: ");

            // int n = Integer.parseInt(br.readLine());
            int n = input.nextInt();
            System.out.println("\n=================================");
            System.out.println("Fibonacci series:");
            while (n > 0) {
                System.out.print(c + " ");
                a = b;
                b = c;
                c = a + b;
                n = n - 1;
            }
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
    }
}