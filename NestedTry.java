import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {

        int []marks =new int[3];
        marks[0]=45;
        marks[1]=25;
        marks[2]=20;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value =");
        int ind=sc.nextInt();
        try{
            System.out.println("Welcome to Vs code ");
            try{
                System.out.println(marks[9]);
            }

            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index dopes not exist !!!!!");
                System.out.println("Exception in level 2");
            }

        }
        catch (Exception e)
        {
        System.out.println("Exception in level 1");
    }
    
}
}
