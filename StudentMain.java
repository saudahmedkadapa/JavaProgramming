import java.util.Date;
import java.util.Scanner;

import DataHiding.nestedClass;

public class StudentMain {
    public static void main(String[] args)
    {
        
        

        DataHiding dhobj=new DataHiding("Saud","Chiplun");
        dhobj.setno(5);
        dhobj.Display();
         System.out.println();
        DataHiding.nestedClass innerObj=dhobj.new nestedClass();
        innerObj.func("India");

        
        
    }
    
}
