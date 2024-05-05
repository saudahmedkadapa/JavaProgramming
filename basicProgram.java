import java.util.Scanner;

public class basicProgram {
    public static void main(String[] args) 
    {
        int j,n;
      
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i <=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.println("*");
            }
            System.out.println("\n");
        }
       
    }

}
