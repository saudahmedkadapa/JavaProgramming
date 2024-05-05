import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the number=");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        while(a<5)
        {
            
           
            System.out.println("a=" +a);
            ++a;
        }
        
       
    }
    
}
