import java.util.Scanner;

public class Recusive{

    static int factorial(int n)
    {
        if((n==0) || (n==1))
        {
            return 1;
        }
        else
        {
            return n*factorial(n-1);
        }

        
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter the number=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("the factorial of " +n+ " is =  " +factorial(n));


        
    }

}