import java.util.Scanner;

public class Excersie {
    public static void main(String[] args) {
       int a;
       int b;
       System.out.println("Enter the number =");
       Scanner sc = new Scanner (System.in);
       int num= sc.nextInt();
       for(a=0;a<=num;a++)
       {
        for(b=0;b<a;b++)
        {
            System.out.print("*");
        }
        System.out.println();

       }
    }
    
}
