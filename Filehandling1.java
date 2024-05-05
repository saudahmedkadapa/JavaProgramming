import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling1 {
    public static void main(String[] args) {
        // File obj =new File("text.txt");
        // try {
        //     obj.createNewFile();
        // } catch (IOException e) {
        //     System.out.println("Unable to connect this file");
        //     e.printStackTrace();
        // }

        try {
            FileWriter fileWriter =new FileWriter("text.txt");
        } catch (IOException e) {
            
            e.printStackTrace();
        }


        fileWriter

        
    }
    
}
