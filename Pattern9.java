import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        int a;
        int b;
        System.out.println("Enter the number =");
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        for(a=0;a<num;a++)
        {
            for(b=2*(num-a);b>=0;b--)
            {
                System.out.print(" ");
            }
            for( b=0;b<=a;b++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
