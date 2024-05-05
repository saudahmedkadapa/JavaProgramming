import java.util.Scanner;

public class ExceptionError {
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=56;
        marks[1]=30;
        marks[2]=25;

        Scanner sc =new Scanner(System.in);
        System.out.println("ENter the array of index=");
        int inde= sc.nextInt();

        System.out.println("Ebetr the number divide value =");
        int number=sc.nextInt();

        try{
            System.out.println("The value of array index enetered is = " +marks[inde]);
            System.out.println("The value f /number is = " +marks[inde]/number);
        }
        catch(Exception e)
        {
            System.out.println("!!!!Some exception Happen!!!");
            System.out.println(e);
        }
    }
    
}
