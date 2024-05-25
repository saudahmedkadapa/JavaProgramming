import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIo {
    public static void main(String[] args) {
        try {
            FileInputStream obj=new FileInputStream("demo.txt");
           int i= obj.read();
            System.out.println((char)i);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    
}
